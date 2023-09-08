package com.school.controller;

import com.school.service.StudentService;

public class StudentDelete {
	public static void main(String[] args) {
		StudentService studentservice = new StudentService();
		boolean res = studentservice.deleteStudentById(1);
		System.out.println(res);

	}

}
