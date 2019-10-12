package com.neuedu.mapper;

import com.neuedu.pojo.ConstantType;

public interface ConstantTypeMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ConstantType record);

    int insertSelective(ConstantType record);

    ConstantType selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(ConstantType record);

    int updateByPrimaryKey(ConstantType record);
}