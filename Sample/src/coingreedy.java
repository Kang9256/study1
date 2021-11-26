import java.io.*;
import java.util.*;

public class coingreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] unit = { 5000, 1000, 500, 100, 50, 10 };

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.println(unit[i] + "¿ø" + money / unit[i]);
			money = money%unit[i];
		}

	}

}
