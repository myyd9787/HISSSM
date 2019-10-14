//package com.neuedu.mapper;
//
//import com.neuedu.pojo.Register;
//
//import java.util.List;
//
//public interface RegisterMapper {
//
//    int deleteByPrimaryKey(Integer ID);
//
//    int insert(Register record);
//
//    int insertSelective(Register record);
//
//    Register selectByPrimaryKey(Integer ID);
//
//    int updateByPrimaryKeySelective(Register record);
//
//    int updateByPrimaryKey(Register record);
//
//    /**
//     * 根据挂号状态查询患者
//     * @param state 状态码
//     * @return
//     */
//    List<Register> getRegisterByState(Integer state);
//}