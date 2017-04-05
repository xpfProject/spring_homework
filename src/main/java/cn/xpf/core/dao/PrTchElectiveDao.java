package cn.xpf.core.dao;

import cn.xpf.core.bean.PrTchElective;
import cn.xpf.core.bean.PrTchElectiveQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrTchElectiveDao {
    int countByExample(PrTchElectiveQuery example);

    int deleteByExample(PrTchElectiveQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PrTchElective record);

    int insertSelective(PrTchElective record);

    List<PrTchElective> selectByExample(PrTchElectiveQuery example);

    PrTchElective selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PrTchElective record, @Param("example") PrTchElectiveQuery example);

    int updateByExample(@Param("record") PrTchElective record, @Param("example") PrTchElectiveQuery example);

    int updateByPrimaryKeySelective(PrTchElective record);

    int updateByPrimaryKey(PrTchElective record);
}