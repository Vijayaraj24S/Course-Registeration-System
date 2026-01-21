package com.example.Course.Registeration.System.Service;

import com.example.Course.Registeration.System.Model.Course;
import com.example.Course.Registeration.System.Model.CourseRegistry;
import com.example.Course.Registeration.System.Repository.CourseRegistryRepository;
import com.example.Course.Registeration.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CourseRegistryRepository courseRegistryRepository;

    public List<Course> availableCourses(){
        return courseRepository.findAll();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepository.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name,emailId,courseName);
        courseRegistryRepository.save(courseRegistry);
    }
}
