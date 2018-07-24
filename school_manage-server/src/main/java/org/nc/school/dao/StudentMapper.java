package org.nc.school.dao;

import org.nc.school.model.Student;

/**
 * @ClassName: StudentMapper
 * @Description: 学生Dao
 * @author nc
 * @date 2018/6/21 08:59
 */
public interface StudentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}