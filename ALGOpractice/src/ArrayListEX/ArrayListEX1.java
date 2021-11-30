package ArrayListEX;

import java.util.*;

public class ArrayListEX1 {

	public static void main(String[] args) {

		List list = new ArrayList(5);
		
		list.add(100);
		list.add(2.5);
		list.add(300);
		list.add(9.9);
		list.add("자바 프로그래밍");
		list.add(1,"데이터베이스");
		
		System.out.println("리스트 내용 출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}

	}

}
