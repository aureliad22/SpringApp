package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IGradeDao;
import com.springapp.model.Grade;

@Transactional
public class GradeDao extends BaseDao<Grade> implements IGradeDao{

	@Override
	public Grade getById(Integer id){
		return super.entityManager.find(Grade.class, id);
	}
	
}
