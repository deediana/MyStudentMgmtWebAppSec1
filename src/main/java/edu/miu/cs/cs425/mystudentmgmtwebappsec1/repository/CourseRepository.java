package edu.miu.cs.cs425.mystudentmgmtwebappsec1.repository;

import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
