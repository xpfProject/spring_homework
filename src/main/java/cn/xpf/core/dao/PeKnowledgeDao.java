package cn.xpf.core.dao;

import cn.xpf.core.bean.PeKnowledge;
import cn.xpf.core.bean.PeKnowledgeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeKnowledgeDao {
    int countByExample(PeKnowledgeQuery example);

    int deleteByExample(PeKnowledgeQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeKnowledge record);

    int insertSelective(PeKnowledge record);

    List<PeKnowledge> selectByExample(PeKnowledgeQuery example);

    PeKnowledge selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeKnowledge record, @Param("example") PeKnowledgeQuery example);

    int updateByExample(@Param("record") PeKnowledge record, @Param("example") PeKnowledgeQuery example);

    int updateByPrimaryKeySelective(PeKnowledge record);

    int updateByPrimaryKey(PeKnowledge record);
}