package com.example.controller;

import com.example.service.ActionService;
import com.example.service.RefService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@CrossOrigin //TODO don't forget about
@RestController
@RequestMapping("/api")
public class Core {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    RefService refService;
    @Autowired
    ActionService service;
    
}
