package com.school.controller;

import com.school.service.TeacherService;

public class TeacherGetall {
	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		teacherService.getAllTeacher();

	}

}
