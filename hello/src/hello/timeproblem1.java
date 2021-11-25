package hello;

import java.io.*;
import java.util.*;

public class timeproblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int htemp = sc.nextInt();
		int mtemp = sc.nextInt();
		if (mtemp >= 45) {
			mtemp -= 45;
		} else {
			if (htemp == 0) {
				htemp = 23;
				mtemp = mtemp + 15;
			} else {
				htemp = htemp - 1;
				mtemp = mtemp + 15;
			}
		}
		System.out.printf("%d %d", htemp, mtemp);
		sc.close();
	}

}
