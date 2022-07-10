package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.impl;


import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Student;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.repository.StudentRepository;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addNewStudent(Student student) {
        var newStudent=studentRepository.save(student);
        return newStudent;
    }


    @Override
    public List<Student> getAllStudents() {
        var students=studentRepository.findAll(Sort.by("name"));
        return students;
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElse(null);
    }

    @Override
    public List<Student> getPassingStudentsOnly() {
        return studentRepository.findStudentsWithCgpaGreaterThan3(3.0f);
    }

    @Override
    public List<Student> getLatestStudents() {
        return studentRepository.findStudentsByStudentNumberGreaterThan(980002);
    }

    @Override
    public Student updateStudent(Student updatedStudent) {
        return studentRepository.save(updatedStudent);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
