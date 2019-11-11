package com.msy.demo.controller;

import com.msy.demo.dao.TransMapper;
import com.msy.demo.po.Trans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/trans")
@EnableAutoConfiguration
@RestController
@CrossOrigin
public class TransController {
    @Autowired
    private TransMapper transMapper;

    @GetMapping("/list")
    public List<Trans> list(){
        List<Trans> list = transMapper.list();
        return  list;
    }

}
