package com.at7766499.gmail.com.LearningRESTAPIs.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.Student;
import com.at7766499.gmail.com.LearningRESTAPIs.entity.StudentDTO;
import com.at7766499.gmail.com.LearningRESTAPIs.repository.StudentRepository;
import com.at7766499.gmail.com.LearningRESTAPIs.service.studentServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentserviceImpl implements studentServices {

    private final StudentRepository studentRepository;
    private final ModelMapper map;

    @Override
    public List<StudentDTO> getAllStudents() {

        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map(student -> map.map(student, StudentDTO.class))
                .toList();
    }
}