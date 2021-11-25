package hello;

import java.io.*;
import java.util.*;

public class control {

	public static void main(String[] args) throws IOException {
		// int[] mem = { 1, 2, 3, 4 };
		// System.out.printf("%d, %d",mem[0],mem[1]);
		String arr[] = new String[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextLine(); //

		if (arr[0].equals("강성우")) {
			System.out.println("arr[0]는 강성우 입니다");
		} else if (arr[0].equals("오세홍")) {
			System.out.println("오세홍 입니다");
		} else {
			System.out.println("윤희찬 입니다");
		}
	}

}
