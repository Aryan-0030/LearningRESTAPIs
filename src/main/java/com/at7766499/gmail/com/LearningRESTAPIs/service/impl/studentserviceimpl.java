package com.at7766499.gmail.com.LearningRESTAPIs.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.student;
import com.at7766499.gmail.com.LearningRESTAPIs.entity.studentDTO;
import com.at7766499.gmail.com.LearningRESTAPIs.repository.studentrepository;
import com.at7766499.gmail.com.LearningRESTAPIs.service.studentservice;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
 
public class StudentServiceImpl implements studentservice {

    private final studentrepository studentrepository;
    @Override
    public List<StudentDto> getAllStudents() {
        List<student> students studentrepository.findAll();
        List<studentDTO> studentlList = students.stream().map(student student -> new studentDTO(student.getid(),student.getName(),student.getEmail))
        return List.of();

    }

}
