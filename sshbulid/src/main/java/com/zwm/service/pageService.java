package com.zwm.service;

import com.zwm.pojo.PageUtil;

import java.util.List;

public interface pageService {
    // 查询全部页码数据内容,返回list
    List<PageUtil> queryPage();
}
