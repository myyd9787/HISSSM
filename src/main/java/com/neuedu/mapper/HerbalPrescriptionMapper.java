package com.neuedu.mapper;

import com.neuedu.pojo.HerbalPrescription;

public interface HerbalPrescriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalPrescription record);

    int insertSelective(HerbalPrescription record);

    HerbalPrescription selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HerbalPrescription record);

    int updateByPrimaryKey(HerbalPrescription record);
}