package com.neuedu.mapper;

import com.neuedu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper extends Mapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(User user)throws Exception;
}