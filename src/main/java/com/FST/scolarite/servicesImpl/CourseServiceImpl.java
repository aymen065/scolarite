package com.FST.scolarite.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FST.scolarite.entities.Course;
import com.FST.scolarite.repositories.CourseRepository;
import com.FST.scolarite.repositories.TeacherRepository;
import com.FST.scolarite.services.CourseService;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;


    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository,TeacherRepository teacherRepository) {
        this.courseRepository = courseRepository;
        this.teacherRepository = teacherRepository;

    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course courseDetails) {
        Course course = courseRepository.findById(id).orElse(null);
        if (course != null) {
        	if (courseDetails.getName() != null) {
                course.setName(courseDetails.getName());
            }
        	
        	if (courseDetails.getTeacher() != null) {

                course.setTeacher(teacherRepository.findById(courseDetails.getTeacher().getId()).get());
            }
            return courseRepository.save(course);
            
        }
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}

