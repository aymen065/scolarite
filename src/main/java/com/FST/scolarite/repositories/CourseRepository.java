package com.FST.scolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FST.scolarite.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
