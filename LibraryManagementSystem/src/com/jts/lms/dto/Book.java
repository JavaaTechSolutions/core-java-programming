package com.jts.lms.dto;

public class Book {
	private int id;
	private int srNo;
	private String bookName;
	private String authorName;
	private int bookQty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookQty() {
		return bookQty;
	}

	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}

}
