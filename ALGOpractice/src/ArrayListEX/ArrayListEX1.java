package ArrayListEX;

import java.util.*;

public class ArrayListEX1 {

	public static void main(String[] args) {

		List list = new ArrayList(5);
		
		list.add(100);
		list.add(2.5);
		list.add(300);
		list.add(9.9);
		list.add("�ڹ� ���α׷���");
		list.add(1,"�����ͺ��̽�");
		
		System.out.println("����Ʈ ���� ���");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}

	}

}
