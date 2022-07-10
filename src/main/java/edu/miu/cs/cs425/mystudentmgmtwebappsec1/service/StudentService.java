package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service;



import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Student;

import java.util.List;

public interface StudentService {
    //static void saveStudent(Student student) {
    //}

    Student addNewStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long studentId);
    //Student save(Student s);
    List<Student> getPassingStudentsOnly();
    List<Student> getLatestStudents();
    Student updateStudent(Student updatedStudent);
    //void updateStudent(Classroom classroom, long studentId);

    void deleteStudentById(Long studentId);
}
