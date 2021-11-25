package hello;
import java.io.*;
import java.util.*;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10+10*10;
		System.out.println(a);
		int temp;
		Scanner sc = new Scanner(System.in);
		temp= sc.nextInt();
		if (temp<100) {
			System.out.println("100보다 작음");
		}
		else {
			System.out.println("100보다 큼");
		}
		
	}

}
