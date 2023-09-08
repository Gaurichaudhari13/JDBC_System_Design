package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	int i = 0;

	// get all data
	public void getAllStudent() {
		connection = helperClass.getConnection();
		String sql = "SELECT *from student";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("==================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// update data
	public boolean updateStudentById(int id) {
		connection = helperClass.getConnection();
		String sql = "UPDATE student SET name='GAURI' WHERE ID=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (id > 0) {
			return true;
		} else {
			return false;
		}
	}

	// to delete record
	public boolean deleteStudentById(int id) {
		connection = helperClass.getConnection();
		String sql = "DELETE FROM student WHERE id = ?";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			i = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally // if we get any error /exception in prepare then we need to close the connetion
					// thats why we use finally block
					// if we
		{
			try {
				// close connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	// to save student data

	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";

		// create statement
		try {

			// passed values to delimiter/placeholder
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			// show check exception bcz it we make mistake in writinf the query then it show
			// sqlexception
			prepareStatement.setInt(1, student.getId());
			prepareStatement.setString(2, student.getName());
			prepareStatement.setString(3, student.getEmail());

			// execute statement
			prepareStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally // if we get any error /exception in prepare then we need to close the connetion
					// thats why we use finally block
					// if we
		{
			try {
				// close connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}
}
