package com.neuedu.mapper;

import com.neuedu.pojo.FmedItem;

public interface FmedItemMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(FmedItem record);

    int insertSelective(FmedItem record);

    FmedItem selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(FmedItem record);

    int updateByPrimaryKey(FmedItem record);
}