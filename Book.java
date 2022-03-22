package edu.monmouth.edu;

import edu.monmouth.hw3.BookException;

public class Book {

	int pages;
	double price;
	String title;
	bookType bookType;

	public Book(int pages, double price, String title, bookType bookType) throws BookException{
		this.pages = pages;
		this.price = price;
		this.title = title;
		this.bookType = bookType;
	}
	
	private int pages(int pages) {
		return pages;
	}
	
	public void setPages(int pages){

		this.pages = pages;
		if(pages<=0) {
			System.out.println("Invalid Number of Pages");
			}
			}
		
	
	public double price() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
		if(price<0) {
			System.out.println("Invalid Price");
		}
	}
	
	public String title(String title) {
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
		if(title.length() == 0 || title==null) {
			System.out.println("Invalid Title Name");
		}
	}
	
	public bookType bookType() {
		return bookType;
	}
	
	public void setBookType(bookType bookType) {
		this.bookType = bookType;
	}
	
	public String toString() {
		return "Title: " + title + "\n"
				+ "Pages: " + pages + "\n"
				+ "Price: $" + price + "\n"
				+ "Book Type: " + bookType;
	}}