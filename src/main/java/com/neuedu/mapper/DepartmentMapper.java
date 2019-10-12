package com.neuedu.mapper;

import com.neuedu.pojo.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}