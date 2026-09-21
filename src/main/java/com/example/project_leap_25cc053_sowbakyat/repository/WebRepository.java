package com.example.project_leap_25cc053_sowbakyat.repository;

import com.example.project_leap_25cc053_sowbakyat.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Student, Long> {
}