package com.lfw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${lesson}")
    private String lesson;

    @Value("{Server.port}")
    private Integer port;

    @Value("${enterprise.subject[0]}")
    private String subject_00;

}