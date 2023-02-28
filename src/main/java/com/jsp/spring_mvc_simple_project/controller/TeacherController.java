package com.jsp.spring_mvc_simple_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring_mvc_simple_project.dto.Teacher;
import com.jsp.spring_mvc_simple_project.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/")
	public String getHome() {
		return "home";
	}
	
	@RequestMapping("/insertTeacher")
	public ModelAndView getTeacherObject() {
		
		ModelAndView modelAndView= new ModelAndView("insert-teacher");
		
		modelAndView.addObject("teacher",new Teacher());
		
		return modelAndView;
		
	}
	
	@RequestMapping("/saveTeacher")
	public ModelAndView getTeacherObject(Teacher teacher) {
		
		ModelAndView modelAndView= new ModelAndView("insert-teacher");
		
		
		teacherService.saveTeacher(teacher);
		
		return modelAndView;
		
	}
	
//	Display Teacher
	@RequestMapping("/displayTeacher")
	public ModelAndView getAllTeacher() {
		
		List<Teacher> teachers= teacherService.getAllTeacher();
		
		ModelAndView modelAndView= new ModelAndView("display-teacher");
		
		modelAndView.addObject("teacherData", teachers);
		
		return modelAndView;
	}
	
//	deleteMethod
	public void deleteTeacherById(int id) {
		
	}
}
