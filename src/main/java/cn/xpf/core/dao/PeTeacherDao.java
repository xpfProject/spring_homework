package cn.xpf.core.dao;

import cn.xpf.core.bean.PeTeacher;
import cn.xpf.core.bean.PeTeacherQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeTeacherDao {
    int countByExample(PeTeacherQuery example);

    int deleteByExample(PeTeacherQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeTeacher record);

    int insertSelective(PeTeacher record);

    List<PeTeacher> selectByExample(PeTeacherQuery example);

    PeTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeTeacher record, @Param("example") PeTeacherQuery example);

    int updateByExample(@Param("record") PeTeacher record, @Param("example") PeTeacherQuery example);

    int updateByPrimaryKeySelective(PeTeacher record);

    int updateByPrimaryKey(PeTeacher record);
}