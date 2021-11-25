package hello;

import java.io.*;
import java.util.*;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1,2,3 중에 하나를 선택해주세요");
		int temp = sc.nextInt();
		
		switch(temp) {
		case 1: 
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		}
	}

}
