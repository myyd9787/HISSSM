package com.neuedu.mapper;

import com.neuedu.pojo.Prescription;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);
}