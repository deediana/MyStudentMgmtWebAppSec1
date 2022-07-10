package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.impl;

import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.repository.ClassroomRepository;
import edu.miu.cs.cs425.mystudentmgmtwebappsec1.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public Classroom save(Classroom cr) {
        return classroomRepository.save(cr);
    }

    @Override
    public Classroom getClassroomById(int id) {
        return classroomRepository.findById(id).orElse(null);
    }
}
