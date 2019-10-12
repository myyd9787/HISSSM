package com.neuedu.mapper;

import com.neuedu.pojo.DrugsTemplate;

public interface DrugsTemplateMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(DrugsTemplate record);

    int insertSelective(DrugsTemplate record);

    DrugsTemplate selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(DrugsTemplate record);

    int updateByPrimaryKey(DrugsTemplate record);
}