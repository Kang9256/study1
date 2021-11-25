package hello;
import java.io.*;
import java.util.*;

public class star1 {
	public static void main(String[] args) throws IOException{
		Scanner sc= new Scanner(System.in);
		int count= sc.nextInt();
		for(int i=1; i<(count+1); i++) {
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println("");
			}
	}
}
