package com.msy.demo.dao;

import com.msy.demo.po.TxInput;

import java.util.List;

public interface TxInputMapper {
    int deleteByPrimaryKey(Integer idx);

    int insert(TxInput record);

    int insertSelective(TxInput record);

    TxInput selectByPrimaryKey(Integer idx);

    int updateByPrimaryKeySelective(TxInput record);

    int updateByPrimaryKey(TxInput record);

    public List<TxInput> list();
}