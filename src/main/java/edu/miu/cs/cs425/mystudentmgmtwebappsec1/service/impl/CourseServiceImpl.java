package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.impl;


import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Course;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.repository.CourseRepository;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
