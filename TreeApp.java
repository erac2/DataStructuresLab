package edu.monmouth.tree;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class TreeApp {
	public static void main(String[] args) {
		// verify there is 1 and only 1 command line argument

		// load the properties file using command line argument
		Properties prop = new Properties();

		final String LOGFILENAME = TreeConstants.LINK;
		//The FileReader reads the file provided

		try {			
			BufferedReader read = new BufferedReader(new FileReader(LOGFILENAME));

			//	FileReader read2 = new FileReader(LOGFILENAME);
			prop.load(read);
			//	prop.load((new FileInputStream(LOGFILENAME)));
		}
		catch(FileNotFoundException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(TreeConstants.CANT);
		}
		catch(IOException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(TreeConstants.CANT);
		}

		// list all properties to System.out
		prop.list(System.out);

		// obtain the value of log_file_name property
		String newName = prop.getProperty("log_file_name");

		// redirect stdout & stderr to the value of log_file_name


		// obtain the value of node_values property
		String newLine = prop.getProperty("node_values");
		String[] split = newLine.split(TreeConstants.SEPERATE);
		String[] split2 = newLine.split(";");
		String out = "";

		// create an instance of the Tree class
		Tree tree = new Tree();
		tree.min();
		tree.max();
		tree.find(10);

		// parse the key / value pairs of node_values and insert into tree
		try {
			BufferedReader read3 = new BufferedReader(new FileReader(LOGFILENAME));
			String sent;
			while((sent = read3.readLine()) != null) {
				RealTree realTree = new RealTree();

				tree.insert(Integer.parseInt(split[0]), Double.parseDouble(split[1]));
			}

		}
		catch(FileNotFoundException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(TreeConstants.CANT);
		}
		catch(IOException e) {
			System.err.print("Cannot find file " + e);
			e.printStackTrace();
			System.exit(TreeConstants.CANT);
		}


		// print out the keys using inorder
		tree.traverse(2);


		// determine if the value 12 is in the tree
		tree.find(12);

		// determine if the value 80 is in the tree
		tree.find(80);
		// print out the minimum value in the tree 
		tree.min();
		// print out the maximum value in the tree      
		tree.max();

	} 

}