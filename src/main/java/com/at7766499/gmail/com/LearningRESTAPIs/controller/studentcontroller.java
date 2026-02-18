package com.at7766499.gmail.com.LearningRESTAPIs.controller;

import org.springframework.web.bind.annotation.RestController;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.studentDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class studentcontroller {


    @GetMapping("/student")
    public List<studentDTO> getStudent() {
        return new studentDTO(41,"abhishek", "abhishek@gmail.com");
    }
    
    
    @GetMapping("/student/{id}")
    public studentDTO getStudentById() {
        return new studentDTO(41,"abhishek", "abhishek@gmail.com");
    }
    
    
}

