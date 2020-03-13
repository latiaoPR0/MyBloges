package com.zwm.dao;

import com.zwm.pojo.PageUtil;

import java.util.List;

public interface PageMapper {
    // 查询全部首页内容,返回list
    List<PageUtil> queryPage();
}
