package edu.miu.cs.cs425.mystudentmgmtwebappsec1.service;

import edu.miu.cs.cs425.mystudentmgmtwebappsec1.model.Classroom;

public interface ClassroomService {
    Classroom save(Classroom cr);
    Classroom getClassroomById(int id);
}
