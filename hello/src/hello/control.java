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

		if (arr[0].equals("������")) {
			System.out.println("arr[0]�� ������ �Դϴ�");
		} else if (arr[0].equals("����ȫ")) {
			System.out.println("����ȫ �Դϴ�");
		} else {
			System.out.println("������ �Դϴ�");
		}
	}

}
