package com.neuedu.mapper;

import com.neuedu.pojo.RegistWork;

public interface RegistWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegistWork record);

    int insertSelective(RegistWork record);

    RegistWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegistWork record);

    int updateByPrimaryKey(RegistWork record);
}