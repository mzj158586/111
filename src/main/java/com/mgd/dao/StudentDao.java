package com.mgd.dao;

import com.mgd.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    Student selectStudent(@Param("name") String name, @Param("password") String password);

    List<Student> selectList();

    int deleteStudentById(Integer id);
}
