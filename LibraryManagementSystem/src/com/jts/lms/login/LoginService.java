package com.jts.lms.login;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jts.lms.dao.DatabaseService;
import com.jts.lms.dao.LoginDao;
import com.jts.lms.service.BookService;

public class LoginService {
	Scanner sc = new Scanner(System.in);

	public void doLogin() throws ClassNotFoundException, SQLException {
		System.out.println("Please provide username:");
		String userName = sc.nextLine();

		System.out.println("Please provide password:");
		String password = sc.nextLine();

		try (Connection conn = DatabaseService.getConnection()) {
			LoginDao loginDao = new LoginDao();
			String userType = loginDao.doLogin(conn, userName, password);

			if (userType == null) {
				System.out.println("Invalid user!");
				return;
			}

			System.out
					.println("Login Success. You logged in as a " + userType + " . Please select from below options.");

			if (userType.equals("admin")) {
				// display admin related menu
				displayAdminMenu(conn);
			} else {
				// display student related menu
			}
		}

	}

	public void displayAdminMenu(Connection conn) throws SQLException {
		int choice;

		do {
			System.out.println("========================================");
			System.out.println(" 1. Search a Book.");
			System.out.println(" 2. Add new Book.");
			System.out.println(" 3. Upgrade Quantity of a Book.");
			System.out.println(" 4. Show All Books.");
			System.out.println(" 5. Register Student.");
			System.out.println(" 6. Show All Registered Students.");
			System.out.println(" 7. Exit From Application.");
			System.out.println("========================================");

			System.out.println("Please Enter your choice.");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				searchBook(conn);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				System.out.println("Thank You for using Library Managemnet System.");
				break;
			default:
				System.out.println("Please select valid option.");
			}

		} while (choice != 7);
	}
	
	private void searchBook(Connection conn) throws SQLException {
		BookService bookService = new BookService();
		System.out.println(" 1. Search with Book Serial No.");
		System.out.println(" 2. Search with Book's Author Name.");
		
		System.out.println("Please Enter your choice.");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: 
			bookService.searchBySrNo(conn);
			break;
		case 2:
			bookService.searchByAuthorName(conn);
		}
	}
}
