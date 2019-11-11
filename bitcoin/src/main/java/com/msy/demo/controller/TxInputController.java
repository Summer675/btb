package com.msy.demo.controller;

import com.msy.demo.dao.TxInputMapper;
import com.msy.demo.po.TxInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/txinput")
@EnableAutoConfiguration
public class TxInputController {
    @Autowired
    private TxInputMapper txInputMapper;

    @GetMapping("/list")
    public List<TxInput> list(){
        List<TxInput> list = txInputMapper.list();
        return  list;
    }

}
