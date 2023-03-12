package com.jcode.apicrudwork.repository;

import com.jcode.apicrudwork.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
