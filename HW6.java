package edu.monmouth.hw6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;

import edu.monmouth.book.*;

public class HW6 {

	public static void main(String[]args) throws BookException {


		try {    
			PrintStream st = new PrintStream(HW6Constants.OUTP); 
			System.setOut(st); 
			System.setErr(st); 
		} catch(FileNotFoundException ioe) { 
			System.err.println("Cannot redirect stderr and stdout " + 
					ioe.getMessage()); 
			ioe.printStackTrace(); 
			System.exit(-1); 
		}

		Set<Book> trees = new TreeSet<Book>();

		Book newTrees = new Book();

		final String BOOKFILE = HW6Constants.FILENAME;

		try {
			BufferedReader read = new BufferedReader(new FileReader(BOOKFILE));
			String sent;
			while((sent = read.readLine()) != null) {


				String sept[] = sent.split(HW6Constants.SEPERATOR);

				try {
					newTrees.setTitle(sept[0]);
				}catch(NumberFormatException e) {
					System.out.println("Invalid Title!");
				}

				try {
					newTrees.setBookType(bookType.valueOf(sept[1]));;
				}catch(NumberFormatException e) {
					System.out.println("Invalid BookType!");
				}

				try {
					newTrees.setPages(Integer.parseInt(sept[2]));
				}catch(NumberFormatException e) {
					System.out.println("Invalid Page Number!");
				}

				try {
					newTrees.setPrice(Double.parseDouble(sept[3]));
				}catch(NumberFormatException e) {
					System.out.println("Invalid Price!");
				}
				
				Set<Book> treePrice=new TreeSet<Book> (new BookPrice());

				trees.add(newTrees);
				System.out.println(trees);
				System.out.println();
				
				treePrice.add(newTrees);
				System.out.print(treePrice + "\n");
				System.out.println();

			}

		} catch (FileNotFoundException e) {
			System.err.println("Cannot find the file " + e);
			System.exit(HW6Constants.CANT);
		} catch (IOException e) {
			System.err.println("Cannot open the file " + e);
			System.exit(HW6Constants.CANT);
		}


	}


}

