package com.msy.demo.controller;

import com.msy.demo.dao.TxInputMapper;
import com.msy.demo.dao.TxOutputMapper;
import com.msy.demo.po.TxInput;
import com.msy.demo.po.TxOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/txoutput")
@EnableAutoConfiguration
public class TxOutputController {


        @Autowired
        private TxOutputMapper txOutputMapper;

        @GetMapping("/list")
        public List<TxOutput> list(){
            List<TxOutput> list = txOutputMapper.list();
            return  list;
        }

    }
