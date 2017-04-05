package cn.xpf.core.dao;

import cn.xpf.core.bean.PeUser;
import cn.xpf.core.bean.PeUserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeUserDao {
    int countByExample(PeUserQuery example);

    int deleteByExample(PeUserQuery example);

    int deleteByPrimaryKey(String id);

    int insert(PeUser record);

    int insertSelective(PeUser record);

    List<PeUser> selectByExample(PeUserQuery example);

    PeUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PeUser record, @Param("example") PeUserQuery example);

    int updateByExample(@Param("record") PeUser record, @Param("example") PeUserQuery example);

    int updateByPrimaryKeySelective(PeUser record);

    int updateByPrimaryKey(PeUser record);
}