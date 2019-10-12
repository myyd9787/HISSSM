package com.neuedu.mapper;

import com.neuedu.pojo.DiseCategory;

public interface DiseCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseCategory record);

    int insertSelective(DiseCategory record);

    DiseCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseCategory record);

    int updateByPrimaryKey(DiseCategory record);
}