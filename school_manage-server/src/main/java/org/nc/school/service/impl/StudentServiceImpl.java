package org.nc.school.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.nc.school.dao.StudentMapper;
import org.nc.school.model.Student;
import org.nc.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }
}
