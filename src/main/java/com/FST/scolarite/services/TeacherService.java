package com.FST.scolarite.services;

import java.util.List;

import com.FST.scolarite.entities.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeachers();

	Teacher getTeacherById(Long id);

	Teacher createTeacher(Teacher teacher);

	Teacher updateTeacher(Long id, Teacher teacherDetails);

	void deleteTeacher(Long id);
}