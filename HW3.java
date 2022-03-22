package edu.monmouth.edu;

import java.io.*;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Properties;


public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strings = new ArrayList<String>();
		LinkedList<String> str = new LinkedList<String>();

		final String LOGFILENAME = HW3Constants.STRINGS;
		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream(LOGFILENAME));
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file " + e);
			System.exit(-1);
		} catch (IOException e) {
			System.err.println("Cannot open the file " + e);
			System.exit(-1);
		}

		properties.list(System.out);
		String lines = properties.getProperty(LOGFILENAME);
		while(lines!=null) {
			strings.add(lines);
		}

		properties.list(System.out);
		String lines2 = properties.getProperty(LOGFILENAME);
		while(lines2!=null) {
			str.add(lines2);
			System.exit(-1);
		}

		System.out.println(strings);
		System.out.println(str);


		//Books Part
		
		ArrayList<Book> books = new ArrayList<Book>();
		LinkedList<Book> books2 = new LinkedList<Book>();

		
	/*	final String BOOKFILE = HW3Constants.BOOKS;
		
		try {
			
		}**/
	}

}


