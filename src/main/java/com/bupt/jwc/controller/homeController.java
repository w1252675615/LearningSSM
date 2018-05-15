package com.bupt.jwc.controller;

import com.bupt.jwc.service.StudentService;
import com.bupt.jwc.model.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "home";
    }

    @RequestMapping("/student")
    @ResponseBody
    public String getStudentDateBySid(@RequestParam(value = "sid", required = true)int sid) {
        Student student =studentService.getStudentBySid(sid);
        String sname = student.getSname();
        String sex = student.getSex().toString();
        int sclass = student.getSclass();
        String res = String.format("StudentID: {%d}, StudentName: {%s}, " +
                "StudentSex: {%s}, StudentClass: {%d}",sid, sname, sex, sclass);
        return res;
    }
}
