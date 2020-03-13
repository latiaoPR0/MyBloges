package com.zwm.service.Impl;

import com.zwm.dao.PageMapper;
import com.zwm.pojo.PageUtil;
import com.zwm.service.pageService;

import java.util.List;

public class pageServiceImpl implements pageService {
    private PageMapper PageMapper;

    public void setPageMapper(com.zwm.dao.PageMapper pageMapper) {
        PageMapper = pageMapper;
    }

    @Override
    public List<PageUtil> queryPage() {
        return PageMapper.queryPage();
    }
}
