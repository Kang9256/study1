import java.io.*;
import java.util.*;

class Method1 {
	/*
	 * void method1_1(){ System.out.println("15"); }
	 */
	void method1_2() {
		Scanner sc = new Scanner(System.in);
		int temp;
		int max;
		int change;
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			temp = sc.nextInt();
			arr[i] = temp;
		}
		max = arr[0];
		for (int z = 0; z < 2; z++) {

			if (max < arr[z + 1]) {
				max = arr[z + 1];
			}
		}
		System.out.println(max);
	}

	void method1_3() {
		Scanner sc = new Scanner(System.in);
		String temp;
		String arr[] = new String[3];
		for (int i = 0; i < 3; i++) {
			temp = sc.nextLine();
			arr[i] = temp;
		}
		Arrays.sort(arr);
		for (int z = 0; z < 3; z++) {
			System.out.print(arr[z]);
		}
	}
}

public class Method01 {
	public static void main(String[] args) throws IOException {

		Method1 go = new Method1();
		// go.method1_2();
		go.method1_3();
	}
}
