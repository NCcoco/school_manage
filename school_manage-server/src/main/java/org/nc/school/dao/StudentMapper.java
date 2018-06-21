package org.nc.school.dao;

import org.nc.school.model.Student;
import org.springframework.stereotype.Component;

/**
 * @ClassName: StudentMapper
 * @Description: 学生Dao
 * @author nc
 * @date 2018/6/21 08:59
 */
@Component
public interface StudentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}