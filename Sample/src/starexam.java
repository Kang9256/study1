import java.io.*;
import java.util.*;
public class starexam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count;
		Scanner sc= new Scanner(System.in);
		count= sc.nextInt();
		
		for(int i=0; i<=(count-1); i++)
		{
			for(int z=count; z>=i; z--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<(1+(i*2)); j++)
				{
				System.out.print("*");
				}
		System.out.println("");
		}

	}

}
