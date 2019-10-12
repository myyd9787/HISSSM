package com.neuedu.mapper;

import com.neuedu.pojo.CheckApply;

public interface CheckApplyMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CheckApply record);

    int insertSelective(CheckApply record);

    CheckApply selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(CheckApply record);

    int updateByPrimaryKey(CheckApply record);
}