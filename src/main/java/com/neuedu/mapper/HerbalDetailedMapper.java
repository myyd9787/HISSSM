package com.neuedu.mapper;

import com.neuedu.pojo.HerbalDetailed;

public interface HerbalDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HerbalDetailed record);

    int insertSelective(HerbalDetailed record);

    HerbalDetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HerbalDetailed record);

    int updateByPrimaryKey(HerbalDetailed record);
}