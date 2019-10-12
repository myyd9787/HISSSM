package com.neuedu.mapper;

import com.neuedu.pojo.PatientCosts;

public interface PatientCostsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(PatientCosts record);

    int insertSelective(PatientCosts record);

    PatientCosts selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(PatientCosts record);

    int updateByPrimaryKey(PatientCosts record);
}