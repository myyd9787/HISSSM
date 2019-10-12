package com.neuedu.mapper;

import com.neuedu.pojo.Disease;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}