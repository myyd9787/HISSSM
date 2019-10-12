package com.neuedu.mapper;

import com.neuedu.pojo.Drugs;

public interface DrugsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    Drugs selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);
}