package com.springapp.dao.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.springapp.model.Teacher;

@Transactional
public abstract class BaseDao <T>{
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public void create(T item) {
		entityManager.persist(item);		
	}
	
	public void delete(T item){
		if (entityManager.contains(item)) {
			entityManager.remove(item);
		} else {
			entityManager.remove(item);
		}
	}
	
	public List getAll(){
		return entityManager.createQuery("from Teacher").getResultList();
	}
	
	public void update(T item){
		entityManager.merge(item);
	}

}
