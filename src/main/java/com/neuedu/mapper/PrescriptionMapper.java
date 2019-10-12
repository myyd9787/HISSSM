package com.neuedu.mapper;

import com.neuedu.pojo.Prescription;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);
}