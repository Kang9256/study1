import java.io.*;
import java.util.*;
/*
 * # Up & Down ����[1�ܰ�]
 * 
 * 1. com�� 8�̴�.
 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
 * 3. ������ ���� �޼����� ����Ѵ�.
 * 1) me < com    : Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com =8;
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextInt()) {
			int choice = sc.nextInt();
		
		if(choice<com) {
			System.out.println("Up!");
		}
		else if(choice==com) {
			System.out.println("Bingo!");
			break;
		}
		else {
			System.out.println("Down!");
		}
		}
		
	}

}
