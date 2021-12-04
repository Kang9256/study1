package Tree;

import java.util.Scanner;
import java.util.TreeMap;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Integer temp2;
		String Stemp;
		TreeMap<Integer, String> data = new TreeMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 등록");
		System.out.print("상품 번호 입력 : ");
		temp = sc.nextInt();
		temp2= Integer.valueOf(temp);
		System.out.println("상품명 입력 : ");
		Stemp = sc.nextLine();
		data.put(temp, Stemp);
		System.out.println("");
		
		System.out.println(data.get(1));
	}

}
