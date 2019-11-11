package com.msy.demo.dao;

import com.msy.demo.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blkid);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blkid);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    List<Block> list();
}