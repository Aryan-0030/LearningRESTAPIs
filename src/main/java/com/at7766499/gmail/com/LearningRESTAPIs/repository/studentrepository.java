package com.at7766499.gmail.com.LearningRESTAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.at7766499.gmail.com.LearningRESTAPIs.entity.student;

@Repository
public interface studentrepository extends JpaRepository<student, Long >  {

}
