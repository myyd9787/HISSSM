package com.neuedu.mapper;

import com.neuedu.pojo.Register;

public interface RegisterMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Register record);

    int insertSelective(Register record);

    Register selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}