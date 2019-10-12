package com.neuedu.mapper;

import com.neuedu.pojo.DrugsDetailed;

public interface DrugsDetailedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(DrugsDetailed record);

    int insertSelective(DrugsDetailed record);

    DrugsDetailed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(DrugsDetailed record);

    int updateByPrimaryKey(DrugsDetailed record);
}