package com.jsp.teacher.controller;


import com.jsp.teacher.dao.TeacherDao;
import com.jsp.teacher.dto.Teacher;

public class Save {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setId(2);
		t1.setName("yash");
		t1.setEmail("yash@gmail.com");
		
		TeacherDao teacherDao = new  TeacherDao();
		Teacher teacher = teacherDao.saveTeacher(t1);
		if (teacher!=null) {
			System.out.println("Teacher "+ teacher.getName()+ " saved successfully");
		}
		
	}

}
