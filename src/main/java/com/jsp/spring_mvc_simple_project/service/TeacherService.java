package com.jsp.spring_mvc_simple_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.spring_mvc_simple_project.dao.TeacherDao;
import com.jsp.spring_mvc_simple_project.dto.Teacher;

@Component
public class TeacherService {
	@Autowired
	TeacherDao teacherDao;
	
//	save methodTeacher
	public Teacher saveTeacher(Teacher teacher) {
		
		return teacherDao.saveTeacher(teacher);
	}
	
//	Display Teacher
	public List<Teacher> getAllTeacher(){
		return teacherDao.getAllTeacher();
	}
	
//	getById
	public Teacher getTeacherById(int id) {
		return teacherDao.getTeacherById(id);
	}
	
//	deleteMethod
	public void deleteTeacherById(int id) {
		 teacherDao.deleteTeacherById(id);
	}
	
//	UpdateTeacher
	public void updateTeacher(Teacher teacher) {
		teacherDao.updateTeacher(teacher);
	}

}
