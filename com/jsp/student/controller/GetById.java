package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class GetById {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.getStudentById(1);
		studentDao.getStudentById(4);
	}

}
