package com.springapp.dao;

import javax.transaction.Transactional;

import com.springapp.dao.base.BaseDao;
import com.springapp.dao.interfaces.IStudentDao;
import com.springapp.model.Student;
import com.springapp.model.Teacher;

@Transactional
public class StudentDao extends BaseDao<Student> implements IStudentDao{

	@Override
	public Student getById(Integer id){
		return super.entityManager.find(Student.class, id);
	}
	/**
	 * Return the teacher having the passed email.
	 */
	public Student getByEmail(String email) {
		return (Student) entityManager.createQuery("from Student where email = :email").setParameter("email", email)
				.getSingleResult();
	}
}
