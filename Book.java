package edu.monmouth.edu;

public class Book {

	int numberOfPages;
	String title;
	bookType bookType;
	
	public Book(String title, int numberOfPages, bookType bookType) {
		this.numberOfPages = numberOfPages;
		this.title = title;
		this.bookType = bookType;
	}
}
