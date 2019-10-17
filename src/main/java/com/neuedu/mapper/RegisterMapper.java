package com.neuedu.mapper;

import com.neuedu.pojo.Register;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterMapper {

    int deleteByPrimaryKey(Integer ID);

    int insert(Register record);

    int insertSelective(Register record);

    Register selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);

    /**
     * 根据挂号状态查询
     * @param state 状态码
     * @param startIndex 当前页起始数
     * @param pageSize 页大小
     * @return 挂号集合
     */
    List<Register> getRegisterByState(@Param("state") int state,
                                      @Param("startIndex") int startIndex,
                                      @Param("pageSize") int pageSize);

    /**
     * 挂号总数量
     * @param state 状态码
     * @return 总数
     */
    int getRegisterByStateCount(int state);
}