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
		
		System.out.println("��ǰ ���");
		System.out.print("��ǰ ��ȣ �Է� : ");
		temp = sc.nextInt();
		temp2= Integer.valueOf(temp);
		System.out.println("��ǰ�� �Է� : ");
		Stemp = sc.nextLine();
		data.put(temp, Stemp);
		System.out.println("");
		
		System.out.println(data.get(1));
	}

}
