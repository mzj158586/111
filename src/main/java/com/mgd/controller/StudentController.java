package com.mgd.controller;

import com.mgd.domain.Student;
import com.mgd.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : 梅广东
 * @Date : 2022/4/5 17:50
 * @Description :
 **/
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/login.do")
    public ModelAndView doLogin(String name,String password){
         Student student = studentService.login(name,password);
        ModelAndView mv = new ModelAndView();
        mv.addObject("student",student);
       if (student !=null){
           mv.setViewName("studentList");
       }else {
           mv.setViewName("/login.jsp");
       }
       return mv;
    }

    @ResponseBody
    @RequestMapping("/selectList.do")
    public List<Student> doselectList(){
        List<Student> students = studentService.selectList();
        return  students;
    }
    @ResponseBody
    @RequestMapping(value = "/deleteStudentById.do")
    public Map<String,String> dodeleteStudentById(Integer id){
        int num = studentService.deleteStudentById(id);
        Map<String,String> map = new HashMap<>();
        if (num>0){
            map.put("msg","删除成功");
        }else {
            map.put("msg","删除失败");
        }
        return  map;
    }
}
