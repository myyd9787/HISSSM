package com.neuedu.mapper;

import com.neuedu.pojo.Rule;

public interface RuleMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Rule record);

    int insertSelective(Rule record);

    Rule selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);
}