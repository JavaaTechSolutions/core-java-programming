package com.jts.lms.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jts.lms.dao.BookDao;
import com.jts.lms.dto.Book;

public class BookService {
	Scanner sc = new Scanner(System.in);

	public void searchBySrNo(Connection conn) throws SQLException {
		System.out.println("Enter Serial No of Book:");
		int srNo = sc.nextInt();
		
		BookDao dao = new BookDao();
		Book book = dao.getBooksBySrno(conn, srNo);
		
		if (book != null) {
			System.out.println("=== Book Details ===");
			System.out.println("Sr No : " + book.getSrNo() + " Book Name: " + book.getBookName() + " Author Name: " + book.getAuthorName());
		} else {
			System.out.println("No Book for Serial No " + srNo + " Found.");
		}
	}
	
	public void searchByAuthorName(Connection conn) throws SQLException {
		System.out.println("Enter Author Name:");
		
		String authorName = sc.nextLine();
		
		BookDao dao = new BookDao();
		Book book = dao.getBooksByAuthorName(conn, authorName);
		
		if (book != null) {
			System.out.println("=== Book Details ===");
			System.out.println("Sr No : " + book.getSrNo() + " Book Name: " + book.getBookName() + " Author Name: " + book.getAuthorName());
		} else {
			System.out.println("No Book for Author Name " + authorName + " Found.");
		}
	}
}
