package cn.xpf.core.dao;

import cn.xpf.core.bean.PrStuElective;
import cn.xpf.core.bean.PrStuElectiveQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrStuElectiveDao {
    int countByExample(PrStuElectiveQuery example);

    int deleteByExample(PrStuElectiveQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PrStuElective record);

    int insertSelective(PrStuElective record);

    List<PrStuElective> selectByExample(PrStuElectiveQuery example);

    PrStuElective selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PrStuElective record, @Param("example") PrStuElectiveQuery example);

    int updateByExample(@Param("record") PrStuElective record, @Param("example") PrStuElectiveQuery example);

    int updateByPrimaryKeySelective(PrStuElective record);

    int updateByPrimaryKey(PrStuElective record);
}