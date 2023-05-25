package com.FST.scolarite.services;

import java.util.List;

import com.FST.scolarite.entities.Course;

public interface CourseService {
	List<Course> getAllCourses();

	Course getCourseById(Long id);

	Course createCourse(Course course);

	Course updateCourse(Long id, Course courseDetails);

	void deleteCourse(Long id);
}
