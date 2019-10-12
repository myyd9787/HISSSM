package com.neuedu.mapper;

import com.neuedu.pojo.ExpenseClass;

public interface ExpenseClassMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ExpenseClass record);

    int insertSelective(ExpenseClass record);

    ExpenseClass selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(ExpenseClass record);

    int updateByPrimaryKey(ExpenseClass record);
}