package edu.monmouth.hw3;
import java.io.IOException;


public class BookException extends Exception {

	public BookException(){
		super();
	}

	public BookException(BookException e) {
		super(e);
	}
}
