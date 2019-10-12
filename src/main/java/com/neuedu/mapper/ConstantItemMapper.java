package com.neuedu.mapper;

import com.neuedu.pojo.ConstantItem;

public interface ConstantItemMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ConstantItem record);

    int insertSelective(ConstantItem record);

    ConstantItem selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(ConstantItem record);

    int updateByPrimaryKey(ConstantItem record);
}