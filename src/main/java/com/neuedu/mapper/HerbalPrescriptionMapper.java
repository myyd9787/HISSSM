package com.neuedu.mapper;

import com.neuedu.pojo.HerbalPrescription;

public interface HerbalPrescriptionMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HerbalPrescription record);

    int insertSelective(HerbalPrescription record);

    HerbalPrescription selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HerbalPrescription record);

    int updateByPrimaryKey(HerbalPrescription record);
}