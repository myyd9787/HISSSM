package com.neuedu.mapper;

import com.neuedu.pojo.HerbalTemplate;

public interface HerbalTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalTemplate record);

    int insertSelective(HerbalTemplate record);

    HerbalTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HerbalTemplate record);

    int updateByPrimaryKey(HerbalTemplate record);
}