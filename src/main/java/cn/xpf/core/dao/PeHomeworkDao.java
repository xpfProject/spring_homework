package cn.xpf.core.dao;

import cn.xpf.core.bean.PeHomework;
import cn.xpf.core.bean.PeHomeworkQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeHomeworkDao {
    int countByExample(PeHomeworkQuery example);

    int deleteByExample(PeHomeworkQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeHomework record);

    int insertSelective(PeHomework record);

    List<PeHomework> selectByExample(PeHomeworkQuery example);

    PeHomework selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeHomework record, @Param("example") PeHomeworkQuery example);

    int updateByExample(@Param("record") PeHomework record, @Param("example") PeHomeworkQuery example);

    int updateByPrimaryKeySelective(PeHomework record);

    int updateByPrimaryKey(PeHomework record);
}