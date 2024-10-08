package com.mouad.app.repositories;

import com.mouad.app.entities.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByCode(String code);
    List<Student> findByProgramId(String programId);
    Optional<Student> findByEmail(String email);
}