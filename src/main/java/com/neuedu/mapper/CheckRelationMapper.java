package com.neuedu.mapper;

import com.neuedu.pojo.CheckRelation;

public interface CheckRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckRelation record);

    int insertSelective(CheckRelation record);

    CheckRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckRelation record);

    int updateByPrimaryKey(CheckRelation record);
}