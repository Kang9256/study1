import java.io.*;

public class InOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\CODE\\sample2.txt", true);
		PrintWriter pw = new PrintWriter(fw);
				pw.println("dkdkdkdk");
		pw.close();
		
	}

}
