package com.swellwu.service;

import com.swellwu.po.Student;

import java.util.List;

/**
 * <p>Description:</p>
 *
 * @author xinjian.wu
 * @date 2017-07-02
 */
public interface StudentService {

    List<Student> listStudentByName(String name);

    Student getStudentById(Integer id);

    void insert(Student student);

}
