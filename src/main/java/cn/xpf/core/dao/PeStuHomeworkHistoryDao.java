package cn.xpf.core.dao;

import cn.xpf.core.bean.PeStuHomeworkHistory;
import cn.xpf.core.bean.PeStuHomeworkHistoryQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeStuHomeworkHistoryDao {
    int countByExample(PeStuHomeworkHistoryQuery example);

    int deleteByExample(PeStuHomeworkHistoryQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeStuHomeworkHistory record);

    int insertSelective(PeStuHomeworkHistory record);

    List<PeStuHomeworkHistory> selectByExample(PeStuHomeworkHistoryQuery example);

    PeStuHomeworkHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeStuHomeworkHistory record, @Param("example") PeStuHomeworkHistoryQuery example);

    int updateByExample(@Param("record") PeStuHomeworkHistory record, @Param("example") PeStuHomeworkHistoryQuery example);

    int updateByPrimaryKeySelective(PeStuHomeworkHistory record);

    int updateByPrimaryKey(PeStuHomeworkHistory record);
}