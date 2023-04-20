package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class Save {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Aniruddha");
		s1.setEmail("Aniruddha@gmail.com");
		
		StudentDao studentDao = new  StudentDao();
		Student student = studentDao.saveStudent(s1);
		if (student!=null) {
			System.out.println("Student "+ student.getName()+ " saved successfully");
		}
		
	}

}
