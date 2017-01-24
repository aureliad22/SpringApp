package com.springapp.manager;

import org.springframework.stereotype.Service;

import com.springapp.manager.base.BaseManager;
import com.springapp.manager.interfaces.IStudentManager;
import com.springapp.model.Student;

@Service
public class StudentManager extends BaseManager<Student> implements IStudentManager  {

}
