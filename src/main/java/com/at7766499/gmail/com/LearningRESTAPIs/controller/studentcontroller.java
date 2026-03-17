package com.at7766499.gmail.com.LearningRESTAPIs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.StudentDTO;
import com.at7766499.gmail.com.LearningRESTAPIs.service.impl.StudentserviceImpl;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentserviceImpl studentserviceImpl;

    public StudentController(StudentserviceImpl studentserviceImpl) {
        this.studentserviceImpl = studentserviceImpl;
    }

    @GetMapping
    public List<StudentDTO> getStudents() {
        return studentserviceImpl.getAllStudents();
    }

    // @GetMapping("/{id}")
    // public StudentDTO getStudentById(@PathVariable Long id) {
    //     return studentserviceImpl.getStudentById(id);
    // }
}