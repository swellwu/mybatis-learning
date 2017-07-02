package com.swellwu.service.impl;

import com.swellwu.dao.StudentMapper;
import com.swellwu.po.Student;
import com.swellwu.po.StudentExample;
import com.swellwu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wu
 * @date 2017-07-02
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> listStudentByName(String name) {
        StudentExample example = new StudentExample();
        example.createCriteria().andNameEqualTo(name);
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }
}
