package com.FST.scolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FST.scolarite.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
