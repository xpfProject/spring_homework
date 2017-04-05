package cn.xpf.core.dao;

import cn.xpf.core.bean.PeStudent;
import cn.xpf.core.bean.PeStudentQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeStudentDao {
    int countByExample(PeStudentQuery example);

    int deleteByExample(PeStudentQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeStudent record);

    int insertSelective(PeStudent record);

    List<PeStudent> selectByExample(PeStudentQuery example);

    PeStudent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeStudent record, @Param("example") PeStudentQuery example);

    int updateByExample(@Param("record") PeStudent record, @Param("example") PeStudentQuery example);

    int updateByPrimaryKeySelective(PeStudent record);

    int updateByPrimaryKey(PeStudent record);
}