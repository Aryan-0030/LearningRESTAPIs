package com.at7766499.gmail.com.LearningRESTAPIs.controller;

import org.springframework.web.bind.annotation.RestController;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.studentDTO;
import com.at7766499.gmail.com.LearningRESTAPIs.repository.studentrepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class studentcontroller {


    private final studentrepository studentrepository;

    public studentcontroller(studentrepository studentrepository) {
       this.studentrepository  = studentrepository; 
    }

    }
    @GetMapping("/student")
    public List<student> getStudent() {
        return studentrepository.findAll()
        
    }

    
    @GetMapping("/student/{id}")
    public studentDTO getStudentById() {
        return new studentDTO(41,"abhishek", "abhishek@gmail.com");
    }
    
    
}

