import java.io.*;
import java.util.*;
/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
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
