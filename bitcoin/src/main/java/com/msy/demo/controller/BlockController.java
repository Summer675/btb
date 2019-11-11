package com.msy.demo.controller;

import com.msy.demo.dao.BlockMapper;
import com.msy.demo.po.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.Oneway;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/block")
@EnableAutoConfiguration
public class BlockController {
    @Autowired
    private BlockMapper blockMapper;
    @GetMapping("/list")
    public List<Block> list(){
        List<Block> blocks = blockMapper.list();
        return blocks;
    }
}
