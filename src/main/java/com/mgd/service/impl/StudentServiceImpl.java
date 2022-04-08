package com.mgd.service.impl;

import com.mgd.dao.StudentDao;
import com.mgd.domain.Student;
import com.mgd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 梅广东
 * @Date : 2022/4/5 20:05
 * @Description :
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student login(String name, String password) {
        Student student = studentDao.selectStudent(name,password);
        return student;
    }

    @Override
    public List<Student> selectList() {
        List<Student> students = studentDao.selectList();
        return students;
    }

    @Override
    public int deleteStudentById(Integer id) {
        int num = studentDao.deleteStudentById(id);
        return num;
    }
}
