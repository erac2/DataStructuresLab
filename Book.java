package edu.monmouth.book;


public class Book implements Comparable<Book>{

	private int pages;
	private double price;
	private String title;
	private bookType bookType;

	public Book() {

	}

	public Book(int pages, double price, String title, bookType bookType) throws BookException{
		this.title = title;
		this.price = price;
		this.pages = pages;
		this.bookType = bookType;

		setPages(pages);
		setPrice(price);
		setTitle(title);
		setBookType(bookType);
	}

	public int getNumbPages() {
		return pages;
	}

	public void setPages(int pages) throws BookException{

		if(pages<0) {
			System.out.println("Invalid Number of Pages");
		}
		else {
			this.pages = pages;
		}
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0) {
			System.out.println("Invalid Price");
		}
		else {
			this.price = price;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws BookException{

		if(title.length() == 0 || title==null) {
			System.out.println("Invalid Title Name");
		}
		else {
			this.title = title;
		}
	}

	public bookType getBookType() {
		return bookType;
	}

	public void setBookType(bookType bookType) throws BookException {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "[Title: " + title + "\n"
				+ "Pages: " + pages + "\n"
				+ "Price: $" + price + "\n"
				+ "Book Type: " + bookType + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("In Book equals...");
		if (o == null) {
			return false;
		}
		if (!(o instanceof Book)) {
			return false;
		}
		if (o == this) {
			return true;
		}
		Book otherBook = (Book)o;
		return otherBook.pages==pages &&
				otherBook.price==price &&
				otherBook.bookType==bookType &&
				otherBook.title.equals(title);
	}

	@Override
	public int compareTo(Book otherBook) {
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		if (this == otherBook) {
			return EQUAL;
		}
		System.out.println("In Book's compareTo");
		if (this.getNumbPages() < otherBook.getNumbPages()) {
			return BEFORE;
		}
		if (this.getNumbPages() > otherBook.getNumbPages()) {
			return AFTER;
		}
		if (this.price < otherBook.price) {
			return BEFORE;
		}
		if (this.price > otherBook.price) {
			return AFTER;
		}
		return this.title.compareTo(otherBook.title);
	}

}