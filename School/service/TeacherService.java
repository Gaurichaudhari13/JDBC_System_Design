
package com.school.service;

import com.school.dao.TeacherDao;
import com.school.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();

	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}

	public boolean deleteTeacherById(int id) {
		return teacherDao.deleteTeacherById(id);
	}

	public void getAllTeacher() {
		teacherDao.getAllTeacher();
	}

	public boolean updateTeacherById(int id) {
		return teacherDao.updateTeacherById(id);
	}
}
