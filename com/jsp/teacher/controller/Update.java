package com.jsp.teacher.controller;

import com.jsp.teacher.dao.TeacherDao;
import com.jsp.teacher.dto.Teacher;

public class Update {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setName("Aniruddha");
		t1.setEmail("Aniruddha@gmail.com");
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.updateTeacher(3, t1);
	}
}
