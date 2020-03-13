package com.zwm.service.Impl;

import com.zwm.dao.ICountMapper;
import com.zwm.pojo.index_countent;
import com.zwm.service.ICountService;

import java.util.List;

public class ICountServiceImpl implements ICountService {
    private ICountMapper iCountMapper;

    public void setiCountMapper(ICountMapper iCountMapper) {
        this.iCountMapper = iCountMapper;
    }

    public int addIcontent(index_countent icount) {
        return this.iCountMapper.addIcontent(icount);
    }

    public int deleteIcontent(int t_id) {
        return iCountMapper.deleteIcontent(t_id);
    }

    public int updateIcount(index_countent icount) {
        return iCountMapper.updateIcount(icount);
    }

    public index_countent queryByIcountID(int id) {
        return iCountMapper.queryByIcountID(id);
    }

    public List<index_countent> queryAllIcount() {
        return iCountMapper.queryAllIcount();
    }

    @Override
    public List<index_countent> selectAllCount(int index, int pagesize) {
        return iCountMapper.selectAllCount(index,pagesize);
    }
}
