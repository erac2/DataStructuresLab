package edu.monmouth.book;

import edu.monmouth.hw2.BookTypes;

public class Book {

	int pages;
	double price;
	String title;
	BookTypes bookType;

	public void book(int pages, double price, String title, BookTypes bookType) {
		this.pages = pages;
		this.price = price;
		this.title = title;
		this.bookType = bookType;
	}
	
	public int pages(int pages) {
		return this.pages = pages;
	}
	
	public double price(double price) {
		return this.price = price;
	}
	
	public String title(String title) {
		return this.title = title;
	}
	
	public BookTypes bookType(BookTypes bookType) {
		return this.bookType = bookType;
	}
}
