package ArrayListEX;

import java.util.*;

public class ArrayListEX2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(5);
		
		list.add("������");
		list.add("����ȫ");
		list.add("��������");
		list.add("������");
		list.add(1,"�����ͺ��̽�");
		list.add("asdffgfdgf");
		
		System.out.println("����Ʈ ���� ���");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+":"+list.get(i));
		}
		
		list.remove("������");
		System.out.println(list.contains("������"));
		
		System.out.println("����Ʈ ���� ���");
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