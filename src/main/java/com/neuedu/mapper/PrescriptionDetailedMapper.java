package com.neuedu.mapper;

import com.neuedu.pojo.PrescriptionDetailed;

public interface PrescriptionDetailedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(PrescriptionDetailed record);

    int insertSelective(PrescriptionDetailed record);

    PrescriptionDetailed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(PrescriptionDetailed record);

    int updateByPrimaryKey(PrescriptionDetailed record);
}