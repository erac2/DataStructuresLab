package edu.monmouth.hw6;

import java.util.Comparator;

import edu.monmouth.book.*;

public class BookPrice implements Comparator<Book>{
	
	public int compare(Book book1, Book book2) {
		return book1.compareTo(book2);
	}


	
}
