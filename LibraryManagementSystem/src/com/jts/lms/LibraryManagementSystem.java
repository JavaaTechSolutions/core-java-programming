package com.jts.lms;

import java.sql.SQLException;

import com.jts.lms.login.LoginService;

public class LibraryManagementSystem {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("******************** Welcome to the College Library! ********************");

		System.out.println("Please do login first for accessing menu.");

		LoginService loginService = new LoginService();
		loginService.doLogin();
	}
}
