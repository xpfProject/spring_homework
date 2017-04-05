package cn.xpf.core.dao;

import cn.xpf.core.bean.PeHomeworkDetail;
import cn.xpf.core.bean.PeHomeworkDetailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeHomeworkDetailDao {
    int countByExample(PeHomeworkDetailQuery example);

    int deleteByExample(PeHomeworkDetailQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeHomeworkDetail record);

    int insertSelective(PeHomeworkDetail record);

    List<PeHomeworkDetail> selectByExample(PeHomeworkDetailQuery example);

    PeHomeworkDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeHomeworkDetail record, @Param("example") PeHomeworkDetailQuery example);

    int updateByExample(@Param("record") PeHomeworkDetail record, @Param("example") PeHomeworkDetailQuery example);

    int updateByPrimaryKeySelective(PeHomeworkDetail record);

    int updateByPrimaryKey(PeHomeworkDetail record);
}