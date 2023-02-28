package com.jsp.spring_mvc_simple_project.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring_mvc_simple_project.dto.Teacher;

@Component
public class TeacherDao {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
//	save methodTeacher
	public Teacher saveTeacher(Teacher teacher) {
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		teacher.setBatchTime(LocalDateTime.now());
		
		entityTransaction.begin();
		
		entityManager.persist(teacher);
		
		entityTransaction.commit();
		
		return null;
		
	}
	
//	Display Teacher
	public List<Teacher> getAllTeacher(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String selectQuery="Select t From Teacher t";
		
		return entityManager.createQuery(selectQuery,Teacher.class).getResultList();
	}
	
//	getById
	public Teacher getTeacherById(int id) {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		return entityManager.find(Teacher.class, id);
	}
	
//	deleteMethod
	public void deleteTeacherById(int id) {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Teacher teacher= entityManager.find(Teacher.class, id);
		
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
	}
	
//	UpdateTeacher
	public void updateTeacher(Teacher teacher) {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		teacher.setBatchTime(LocalDateTime.now());
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		
	}
	
	
	

}
