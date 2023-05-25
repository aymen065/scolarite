package com.FST.scolarite.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FST.scolarite.entities.Student;
import com.FST.scolarite.repositories.StudentRepository;
import com.FST.scolarite.services.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	private final StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Long id, Student studentDetails) {
		Student student = studentRepository.findById(id).orElse(null);
		if (student != null) {
			student.setName(studentDetails.getName());
			student.setAddress(studentDetails.getAddress());
			return studentRepository.save(student);
		}
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
