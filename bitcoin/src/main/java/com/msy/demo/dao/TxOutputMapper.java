package com.msy.demo.dao;

import com.msy.demo.po.TxOutput;

import java.util.List;

public interface TxOutputMapper {
    int deleteByPrimaryKey(Integer idx);

    int insert(TxOutput record);

    int insertSelective(TxOutput record);

    TxOutput selectByPrimaryKey(Integer idx);

    int updateByPrimaryKeySelective(TxOutput record);

    int updateByPrimaryKey(TxOutput record);

   public List<TxOutput> list();
}