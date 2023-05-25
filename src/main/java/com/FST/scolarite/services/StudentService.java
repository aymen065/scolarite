package com.FST.scolarite.services;

import java.util.List;

import com.FST.scolarite.entities.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student getStudentById(Long id);

	Student createStudent(Student student);

	Student updateStudent(Long id, Student studentDetails);

	void deleteStudent(Long id);
}
