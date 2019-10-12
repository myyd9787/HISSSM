package com.neuedu.mapper;

import com.neuedu.pojo.HerbalDetailed;

public interface HerbalDetailedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HerbalDetailed record);

    int insertSelective(HerbalDetailed record);

    HerbalDetailed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HerbalDetailed record);

    int updateByPrimaryKey(HerbalDetailed record);
}