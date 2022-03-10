import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Properties {

	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		
		final String FILENAME = "monmouthProperties.txt";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(FILENAME));
		} catch(FileNotFoundException e) {
			System.err.println("Can't open file " + e);
			System.exit(-1);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		final String FILENAME2 = "monmouthProperties.txt";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(FILENAME));
		} catch(FileNotFoundException e) {
			System.err.println("Can't open file " + e);
			System.exit(-1);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
