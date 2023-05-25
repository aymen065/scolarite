package com.FST.scolarite.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FST.scolarite.entities.Teacher;
import com.FST.scolarite.repositories.TeacherRepository;
import com.FST.scolarite.services.TeacherService;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    
    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    
    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }
    
    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }
    
    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    
    @Override
    public Teacher updateTeacher(Long id, Teacher teacherDetails) {
        Teacher teacher = teacherRepository.findById(id).orElse(null);
        if (teacher != null) {
            teacher.setName(teacherDetails.getName());
            teacher.setDepartment(teacherDetails.getDepartment());
            return teacherRepository.save(teacher);
        }
        return null;
    }
    
    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}

