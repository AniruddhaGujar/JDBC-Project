package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class Delete {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.deleteStudentById(1);
		if (flag == true) {
			System.out.println("student is deleted");
		} else {
			System.out.println("not deleted");
		}
	}

}
