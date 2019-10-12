package com.neuedu.mapper;

import com.neuedu.pojo.MedicalDisease;

public interface MedicalDiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalDisease record);

    int insertSelective(MedicalDisease record);

    MedicalDisease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicalDisease record);

    int updateByPrimaryKey(MedicalDisease record);
}