package Day6;
import java.io.*;
public class ListOfNumbers {

	//create an integer array
	private int[] list = {5, 6, 8, 9, 2};
	
	//method to write data from array to a file
	public void writeList() {
		PrintWriter out = null;
		
		try {
			System.out.println("Entering try statement");
			
			//creating a new file OutputFile.txt
			out = new PrintWriter(new FileWriter("OutputFile.txt"));
			
			//writing values from list array to Output.txt
			for(int i = 0; i<7; i++) {
				out.println("Value at: " + i + " = " + list[i]);
			}
		}
		catch (Exception e) {
			System.out.println("Exception => " + e.getMessage());
		}
		
		finally {
			//checkingif PrintWrite has been opened
			if(out != null) {
				System.out.println("Closing PrintWriter");
				//close PrintWriter
				out.close();

			}
			else {
				System.out.println("PrintWriter not open");
			}
		}
		

	}
}

class Main17{
	public static void main(String[] args) {
		ListOfNumbers list = new ListOfNumbers();
		list.writeList();
	}
}
