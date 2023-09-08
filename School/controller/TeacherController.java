package com.school.controller;

import com.school.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.updateTeacherById(1);
		System.out.println(res);

	}
}
