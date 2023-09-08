package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();

	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);

	}

	// for delete
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(1);
	}

	// for update
	public boolean upadateStudentById(int id) {
		return studentDao.updateStudentById(1);
	}

	public void getAllStudent() {
		studentDao.getAllStudent();
	}
}
