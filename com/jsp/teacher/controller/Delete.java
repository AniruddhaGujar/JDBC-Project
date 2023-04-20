package com.jsp.teacher.controller;

import com.jsp.teacher.dao.TeacherDao;

public class Delete {

	public static void main(String[] args) {

		TeacherDao teacherDao = new TeacherDao();
		teacherDao.deleteTeacherById(1);
	}
}
