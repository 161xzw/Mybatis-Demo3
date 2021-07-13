package com.xiao.dao;

import com.xiao.pojo.Student;
import com.xiao.pojo.Teacher;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.selectTeacher(1);
        System.out.println(teacher);
    }
    @Test
    public void getStudentT(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentT = mapper.getStudentT();
        for (Student student:studentT) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public  void getStudentT1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentT1 = mapper.getStudentT1();
        for (Student student:studentT1) {
            System.out.println(student);
        }
           sqlSession.close();
    }
    @Test
    public void selectTeachers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectTeachers();
        for (Teacher teacher:teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void TeacherStudent1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectTeachers1();
        for (Teacher teacher:teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
}
