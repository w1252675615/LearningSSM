package com.bupt.jwc.service;


import com.bupt.jwc.dao.StudentMapper;
import com.bupt.jwc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    
    public Student getStudentBySid(int id) {
        return studentMapper.getStudentBySid(id);
    }
}
