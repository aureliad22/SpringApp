package com.springapp.manager;

import org.springframework.stereotype.Service;

import com.springapp.manager.base.BaseManager;
import com.springapp.manager.interfaces.IGradeManager;
import com.springapp.model.Grade;

@Service
public class GradeManager extends BaseManager<Grade> implements IGradeManager  {

}
