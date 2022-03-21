package edu.monmouth.edu;

import java.io.*;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.BufferedReader;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strings = new ArrayList<String>();
		LinkedList<String> str = new LinkedList<String>();
		
		final Reader LOGFILENAME = HW3Constants.STRINGS;
		
		try {
			BufferedReader st = new BufferedReader(LOGFILENAME);
			System.setOut(st);
			System.setErr(st);
			FileReader read = new FileReader(LOGFILENAME);
			String eachLine = LOGFILENAME.read();
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file " + e);
			System.exit(-1);
		} catch (IOException e) {
			System.err.println("Cannot open the file " + e);
			System.exit(-1);
		}
		
		
	}

}
