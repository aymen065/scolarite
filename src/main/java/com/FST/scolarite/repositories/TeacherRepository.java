package com.FST.scolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FST.scolarite.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
