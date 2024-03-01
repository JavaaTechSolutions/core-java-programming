package com.jts.lms.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.jts.lms.dao.BookDao;
import com.jts.lms.dao.StudentDao;
import com.jts.lms.dto.Book;

public class StudentService {
	Scanner sc = new Scanner(System.in);

	public void searchBySrNo(Connection conn) throws SQLException {
		System.out.println("Enter Serial No of Book:");
		int srNo = sc.nextInt();

		BookDao dao = new BookDao();
		Book book = dao.getBooksBySrno(conn, srNo);

		if (book != null) {
			System.out.println("=== Book Details ===");
			System.out.println("Sr No : " + book.getSrNo() + " Book Name: " + book.getBookName() + " Author Name: "
					+ book.getAuthorName());
		} else {
			System.out.println("No Book for Serial No " + srNo + " Found.");
		}
	}

	public void addStudent(Connection conn) throws SQLException {
		System.out.println("Enter Studnet Name:");
		String studentName = sc.nextLine();

		System.out.println("Enter Registration No:");
		String regNo = sc.nextLine();

		StudentDao dao = new StudentDao();
		boolean isStdExist = dao.getStudentByRegno(conn, regNo);

		if (isStdExist) {
			System.out.println("Students details exist into our system.");
			return;
		}

		dao.saveStudent(conn, studentName, regNo);
	}

	public void getAllStudents(Connection conn) throws SQLException {
		StudentDao dao = new StudentDao();
		dao.getAllStudents(conn);
	}

}
