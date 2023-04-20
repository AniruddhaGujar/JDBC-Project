package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class Update {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Rushikesh");
		s1.setEmail("abc123@gmail.com");

		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.updateStudent(5, s1);
		if (flag == true) {
			System.out.println("Student updated");
		}
	}
}
