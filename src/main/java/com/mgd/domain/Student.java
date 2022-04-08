package com.mgd.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author : 梅广东
 * @Date : 2022/4/5 17:24
 * @Description : 学生类
 **/
public class Student implements Serializable {

    private  int id;
    private String name;
    private String password;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student sudent = (Student) o;
        return id == sudent.id &&
                age == sudent.age &&
                Objects.equals(name, sudent.name) &&
                Objects.equals(password, sudent.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, age);
    }

}
