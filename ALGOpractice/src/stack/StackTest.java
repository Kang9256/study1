package stack;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk =new Stack<String>();
		
		stk.push("ȫ�浿");
		stk.push("�̸���");
		stk.push("������");
		
		for(int i =0; i<stk.size(); i++) {
			System.out.println(i +":"+stk.get(i));
		}
		
		System.out.println("����ũ��" + stk.size());
		System.out.println("�ֻ��� ��" + stk.peek());
		System.out.println("�̸��� ����ֳ�?" + stk.contains("�̸���"));
		System.out.println("pop ����1"+ stk.pop());
		
		for(int z =0; z<stk.size(); z++) {
			System.out.println(z +":"+stk.get(z));
		}
		System.out.println("Ŭ���� ����");
		stk.clear();
		System.out.println("empty ���� :"+stk.empty());
		
		
	}

}
