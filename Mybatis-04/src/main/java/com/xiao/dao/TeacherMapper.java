package com.xiao.dao;

import com.xiao.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher where id =#{id}")
    Teacher selectTeacher(int id);

    List<Teacher> selectTeachers();

    List<Teacher> selectTeachers1();

}
