package com.neuedu.mapper;

import com.neuedu.pojo.MedicalDisease;

public interface MedicalDiseaseMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(MedicalDisease record);

    int insertSelective(MedicalDisease record);

    MedicalDisease selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(MedicalDisease record);

    int updateByPrimaryKey(MedicalDisease record);
}