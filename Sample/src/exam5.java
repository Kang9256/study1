import java.io.*;
import java.util.*;

class User{
	String name;
	int account=0;
	void add(int money){
		this.account+=money;
	}
	void minus(int money) {
		if(this.account>money) {
		this.account-=money;
		}
		else {
			System.out.println("잔액이 부족합니다");
		}
	}
}

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1= new User();
		System.out.println(user1.account);
		user1.add(30000);
		System.out.println(user1.account);
		user1.minus(5000);
		System.out.println(user1.account);
		user1.minus(30000);
		System.out.println(user1.account);
	}
}
