package com.mgd.service;

import com.mgd.domain.Student;

import java.util.List;

public interface StudentService {


    Student login(String name, String password);

    List<Student> selectList();

    int deleteStudentById(Integer id);
}
