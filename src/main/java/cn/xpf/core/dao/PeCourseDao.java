package cn.xpf.core.dao;

import cn.xpf.core.bean.PeCourse;
import cn.xpf.core.bean.PeCourseQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeCourseDao {
    int countByExample(PeCourseQuery example);

    int deleteByExample(PeCourseQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeCourse record);

    int insertSelective(PeCourse record);

    List<PeCourse> selectByExample(PeCourseQuery example);

    PeCourse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeCourse record, @Param("example") PeCourseQuery example);

    int updateByExample(@Param("record") PeCourse record, @Param("example") PeCourseQuery example);

    int updateByPrimaryKeySelective(PeCourse record);

    int updateByPrimaryKey(PeCourse record);
}