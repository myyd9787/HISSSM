package com.neuedu.mapper;

import com.neuedu.pojo.HerbalTempDetailed;

public interface HerbalTempDetailedMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(HerbalTempDetailed record);

    int insertSelective(HerbalTempDetailed record);

    HerbalTempDetailed selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(HerbalTempDetailed record);

    int updateByPrimaryKey(HerbalTempDetailed record);
}