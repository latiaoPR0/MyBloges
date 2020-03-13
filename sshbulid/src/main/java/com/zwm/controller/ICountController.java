package com.zwm.controller;

import com.zwm.pojo.index_countent;
import com.zwm.service.ICountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class ICountController {
    // controller 调 service层
    @Autowired
    @Qualifier("iCountServiceImpl")
    private ICountService iCountService;

    // 返回一个404的网页
    @RequestMapping("/404")
    public String ExceptionHTML(Model model) {
        return "404";
    }

    @RequestMapping(value = "/itemEdit.action")
    public ModelAndView toEdit(Integer id, HttpServletRequest request, HttpServletResponse response
            , HttpSession session, Model model) {
        //根据前端传递过来的id，来通过sql语句查询数据
        index_countent queryiCount = iCountService.queryByIcountID(id);
        System.out.println("目的网址是:" + queryiCount);
        //新建一个ModelAndView对象
        ModelAndView modelandview = new ModelAndView();
        //将查询的数据放入到ModelAndView对象中
        //"itemList"：为别名，在前端页面上使用
        //queryiCount：执行sql语句查询到的数据
        modelandview.addObject("itemList", queryiCount);
        modelandview.setViewName(queryiCount.getT_gotohtml());
        return modelandview;
    }

    // 查询所有内容,返回到一个页面
    @RequestMapping("/index")
    public String list(Model model) {
        List<index_countent> index_countents = iCountService.queryAllIcount();
        System.out.println(index_countents);
        model.addAttribute("one", index_countents);
        return "index";
    }
}
