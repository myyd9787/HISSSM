package com.neuedu.mapper;

import com.neuedu.pojo.Scheduling;

public interface SchedulingMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    Scheduling selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);
}