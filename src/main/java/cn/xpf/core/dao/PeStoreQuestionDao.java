package cn.xpf.core.dao;

import cn.xpf.core.bean.PeStoreQuestion;
import cn.xpf.core.bean.PeStoreQuestionQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeStoreQuestionDao {
    int countByExample(PeStoreQuestionQuery example);

    int deleteByExample(PeStoreQuestionQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeStoreQuestion record);

    int insertSelective(PeStoreQuestion record);

    List<PeStoreQuestion> selectByExample(PeStoreQuestionQuery example);

    PeStoreQuestion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeStoreQuestion record, @Param("example") PeStoreQuestionQuery example);

    int updateByExample(@Param("record") PeStoreQuestion record, @Param("example") PeStoreQuestionQuery example);

    int updateByPrimaryKeySelective(PeStoreQuestion record);

    int updateByPrimaryKey(PeStoreQuestion record);
}