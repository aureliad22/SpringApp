package com.springapp.manager;

import org.springframework.stereotype.Service;

import com.springapp.manager.base.BaseManager;
import com.springapp.manager.interfaces.ITeacherManager;
import com.springapp.model.Teacher;

@Service
public class TeacherManager extends BaseManager<Teacher> implements ITeacherManager {

}
