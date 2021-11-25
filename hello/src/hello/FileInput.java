package hello;

import java.io.*;
import java.util.*;

public class FileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//byte[] input = new byte[1024];
		//FileInputStream fi = new FileInputStream("C:\\CODE\\sample2.txt");
		//fi.read(input);
		//System.out.println(new String(input));
		//fi.close();
		
		//BufferedReader br = new BufferedReader(new FileReader("C:\\CODE\\sample2.txt"));
		File file = new File("C:\\CODE\\sample2.txt");
		Scanner sc= new Scanner(file);
		String line = sc.nextLine();
		System.out.println(line);
	}

}
