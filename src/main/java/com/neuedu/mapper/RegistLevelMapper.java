package com.neuedu.mapper;

import com.neuedu.pojo.RegistLevel;

public interface RegistLevelMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(RegistLevel record);

    int insertSelective(RegistLevel record);

    RegistLevel selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(RegistLevel record);

    int updateByPrimaryKey(RegistLevel record);
}