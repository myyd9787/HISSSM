package com.neuedu.service;

import com.neuedu.pojo.Register;

import java.util.List;

public interface DoctorService {
    /**
     * 根据挂号状态查询
     * @param state 状态码
     * @param startIndex 当前页起始数
     * @param pageSize 页大小
     * @return 挂号集合
     */
    List<Register> getRegisterByState(int state, int startIndex, int pageSize);

    /**
     * 挂号总数量
     * @param state 状态码
     * @return 总数
     */
    int getRegisterByStateCount(int state);
}
