package com.zwm.controller;

import com.zwm.pojo.PageUtil;
import com.zwm.pojo.index_countent;
import com.zwm.service.ICountService;
import com.zwm.service.pageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("Controller")
public class PageController {
    @Autowired
    @Qualifier("customerServiceImpl")
    private pageService pageService;

    @Autowired
    @Qualifier("iCountServiceImpl")
    private ICountService iCountService;

    @RequestMapping("customer")
    public ModelAndView findAllUser(String getindex) {
        int index = 1;//设置开始页
        int pagesize = 4;//设置每页的数量
        List<index_countent> index_countents = iCountService.queryAllIcount();
        int countnum = index_countents.size(); // 获取内容的个数
        int pageSum = (int) Math.ceil((double) countnum / pagesize); //获取总页数

        if (getindex != null) {
            index = Integer.parseInt(getindex);
            if (index < 1) {
                index = 1;
            } else if (index > pageSum) {
                index = pageSum;
            }
        }
        System.out.println("总页数:"+pageSum);
        //把数据库中的数据拿到
        List<index_countent> list = iCountService.selectAllCount((index - 1) * pagesize, index + pagesize);
        //用工具类封装
        PageUtil pagecustomer = new PageUtil(index, pagesize,pageSum,list);
        System.out.println("pagecustomer的内容:"+pagecustomer);
        return new ModelAndView("index","Userinfo",pagecustomer);
    }
}