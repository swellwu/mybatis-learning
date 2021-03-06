package com.swellwu.service.impl;

import com.swellwu.Application;
import com.swellwu.dao.StudentMapper;
import com.swellwu.po.Student;
import com.swellwu.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wu
 * @date 2017-07-02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
@Rollback
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void studentServiceTest(){
        assertTrue(studentService!=null);
        Student student = new Student();
        student.setName("张三");
        student.setAge((byte) 33);
        student.setSex((byte) 1);
        studentService.insert(student);
        assertTrue(studentService.getStudentById(student.getId()).getName().equals(student.getName()));
        List<Student> list = studentService.listStudentByName(student.getName());
        assertTrue(list.size()==1);
    }

    @Test
    public void insertList(){
        List<Student> list = new ArrayList<Student>();
        for(int i=0;i<100;++i){
            Student student = new Student();
            student.setName("张三"+i);
            student.setAge((byte) i);
            student.setSex((byte) i);
            list.add(student);
        }
        int effects = studentMapper.insertList(list);
        assertTrue(effects==100);
    }
}