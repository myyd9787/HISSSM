package com.neuedu.mapper;

import com.neuedu.pojo.SettleCategory;

public interface SettleCategoryMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(SettleCategory record);

    int insertSelective(SettleCategory record);

    SettleCategory selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(SettleCategory record);

    int updateByPrimaryKey(SettleCategory record);
}