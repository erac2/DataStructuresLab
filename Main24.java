package Day7;
import java.io.*;
public class Main24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		String line;
		
		try {
			System.out.println("Entering try block");
			br = new BufferedReader(new FileReader("test.txt"));
			while((line = br.readLine()) != null) {
				System.out.println("Line =>" + line);
			}
		} catch (IOException e) {
			System.out.println("IOException in try block =>" + e.getMessage());
		} finally {
			System.out.println("Entering finally block");
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				System.out.println("IOException in finally block =>" + e.getMessage());
			}
		}
	}

}
