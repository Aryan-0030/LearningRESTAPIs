package com.at7766499.gmail.com.LearningRESTAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}