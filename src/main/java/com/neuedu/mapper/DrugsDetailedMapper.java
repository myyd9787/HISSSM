package com.neuedu.mapper;

import com.neuedu.pojo.DrugsDetailed;

public interface DrugsDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugsDetailed record);

    int insertSelective(DrugsDetailed record);

    DrugsDetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugsDetailed record);

    int updateByPrimaryKey(DrugsDetailed record);
}