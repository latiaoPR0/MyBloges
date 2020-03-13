package com.zwm.dao;

import com.zwm.pojo.index_countent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICountMapper {
    // 增加一个首页(Index)内容
    int addIcontent(index_countent icount);

    // 根据ID删除一个首页内容
    int deleteIcontent(int t_id);

    // 更新首页文本内容
    int updateIcount(index_countent icount);

    // 根据iD返回一个首页文本内容
    index_countent queryByIcountID(int id);

    // 查询全部首页内容,返回list
    List<index_countent> queryAllIcount();

    //查询
    List<index_countent> selectAllCount(@Param("index")int index,@Param("pagesize") int pagesize);
}
