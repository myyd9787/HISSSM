package com.neuedu.mapper;

import com.neuedu.pojo.ExpenseClass;

public interface ExpenseClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpenseClass record);

    int insertSelective(ExpenseClass record);

    ExpenseClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpenseClass record);

    int updateByPrimaryKey(ExpenseClass record);
}