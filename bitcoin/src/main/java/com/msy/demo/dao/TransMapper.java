package com.msy.demo.dao;

import com.msy.demo.po.Trans;

import java.util.List;

public interface TransMapper {
    int deleteByPrimaryKey(Integer txid);

    int insert(Trans record);

    int insertSelective(Trans record);

    Trans selectByPrimaryKey(Integer txid);

    int updateByPrimaryKeySelective(Trans record);

    int updateByPrimaryKey(Trans record);

    List<Trans> list();
}