package com.springapp.dao.interfaces;

import org.springframework.stereotype.Repository;

import com.springapp.dao.interfaces.base.IBaseDao;
import com.springapp.model.Student;

@Repository
public interface IStudentDao extends IBaseDao<Student>{

}
