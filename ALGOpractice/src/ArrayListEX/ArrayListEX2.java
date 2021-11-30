package ArrayListEX;

import java.util.*;

public class ArrayListEX2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(5);
		
		list.add("강성우");
		list.add("오세홍");
		list.add("정현지지");
		list.add("윤희찬");
		list.add(1,"데이터베이스");
		list.add("asdffgfdgf");
		
		System.out.println("리스트 내용 출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}
		
		list.remove("강성우");
		System.out.println(list.contains("강성우"));
		
		System.out.println("리스트 내용 출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}
		int max=0;
		for(int z=0; z<list.size(); z++){
			if(z==0) {
				max=list.get(z).length();
			}
			if(max<list.get(z).length()) {
				max=list.get(z).length();
			}
		}
		System.out.println(max);
		}

}