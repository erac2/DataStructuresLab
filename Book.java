package edu.monmouth.book;
import java.lang.Exception;

import edu.monmouth.hw2.BookTypes;

public class Book {

	int pages;
	double price;
	String title;
	BookTypes bookType;

	public Book(int pages, double price, String title, BookTypes bookType) {
		this.pages = pages;
		this.price = price;
		this.title = title;
		this.bookType = bookType;
	}
	
	public int pages(int pages) {
		return pages;
	}
	
	public void setPages(int pages){
		this.pages = pages;
		if(pages <= 0) {
			System.out.println("")
		}
		}
	
	public double price() {
		return price;
	}
	
	public double setPrice(double price) throws BookException {
		this.price = price;
	}
	
	public String title(String title) {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public BookTypes bookType() {
		return bookType;
	}
	
	public void setBookType(BookTypes bookType) {
		this.bookType = bookType;
	}
	
	public String toString() {
		return "Title: " + title + "\n"
				+ "Pages: " + pages + "\n"
				+ "Price: $" + price + "\n"
				+ "Book Type: " + bookType;
	}
