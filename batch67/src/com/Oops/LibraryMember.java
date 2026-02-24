package com.Oops;

public class LibraryMember {
	private String BookName;
	private int Booksborrowed;

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		this.BookName = bookName;
	}

	public int getBooksborrowed() {
		return Booksborrowed;
	}

	public void setBooksborrowed(int booksborrowed) {
		this.Booksborrowed = booksborrowed;
	}

	public double calculatefee() {
		return 0;
	}
}

