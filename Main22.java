package Day7;

import java.io.*;

public class Main22 {

	public static void findFile() throws IOException{
		throw new IOException("File not found");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			findFile();
			System.out.println("Rest of codein try block");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
