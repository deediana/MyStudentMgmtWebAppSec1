package edu.miu.cs.cs425.mystudentmgmtwebappsec1.repository;

import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select s from Student s where s.cgpa >= ?1 order by s.name")
    List<Student> findStudentsWithCgpaGreaterThan3(float cgpa);

    List<Student> findStudentsByStudentNumberGreaterThan(long studentNumber);

    @Modifying
    @Query("update Student s set s.classroom = ?1 where s.studentId = ?2")
    void update(Classroom classroom, long id);

    @Query(value = "select p from Student p where p.name = :name")
    Optional<Student> getStudentByName(String name);

}
