package com.school.controller;

import com.school.service.TeacherService;

public class TeacherDelete {
	public static void main(String[] args) {
		TeacherService teacherservice = new TeacherService();
		boolean res = teacherservice.deleteTeacherById(3);
		System.out.println(res);

	}

}
