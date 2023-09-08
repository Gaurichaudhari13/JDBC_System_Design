package com.school.controller;

import com.school.service.TeacherService;

public class TeacherUpdate {
	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.updateTeacherById(2);
		if (res == true) {
			System.out.println("Updated");
		} else {
			System.out.println("Failed");
		}
	}

}
