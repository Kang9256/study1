package stack;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk =new Stack<String>();
		
		stk.push("홍길동");
		stk.push("이몽룡");
		stk.push("강성우");
		
		for(int i =0; i<stk.size(); i++) {
			System.out.println(i +":"+stk.get(i));
		}
		
		System.out.println("스택크기" + stk.size());
		System.out.println("최상위 값" + stk.peek());
		System.out.println("이몽룡 들어있나?" + stk.contains("이몽룡"));
		System.out.println("pop 수행1"+ stk.pop());
		
		for(int z =0; z<stk.size(); z++) {
			System.out.println(z +":"+stk.get(z));
		}
		System.out.println("클리어 수행");
		stk.clear();
		System.out.println("empty 수행 :"+stk.empty());
		
		
	}

}
