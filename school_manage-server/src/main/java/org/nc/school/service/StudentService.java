package org.nc.school.service;

import org.nc.school.model.Student;

/**
 * @ClassName: StudentService
 * @Description: 学生服务
 * @author nc
 * @date 2018/6/21 08:47
 */
public interface StudentService {
    /**
     * @Title: add
     * @Description: 新增学生
     * @param student
     */
    int add(Student student);
}
