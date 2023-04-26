package com.smartcoading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcoading.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
