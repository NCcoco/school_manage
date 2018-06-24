package org.nc.school.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import org.nc.school.model.Student;
import org.nc.school.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName: StudentController
 * @Description: 学生逻辑处理
 * @author nc
 * @date 2018/6/21 09:53
 */
@Api("学生API")
@RestController
@RequestMapping("/api")
public class StudentController {

    @Reference
    private StudentService studentService;

    @PostMapping("sos")
    public int addStudent(){
        String uuid = UUID.randomUUID().toString();
        Student student = new Student();
        student.setId(uuid);
        student.setAccess("123");
        student.setPassword("123");
        student.setSex("1");
        return studentService.add(student);
    }
}
