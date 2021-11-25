import java.io.*;
import java.util.*;
/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */
public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "john";
		int pw = 123;
		
		String myid;
		int mypw;
		Scanner sc = new Scanner(System.in);
		myid = sc.nextLine();
		mypw = sc.nextInt();
		
		if(id.equals(myid) && pw==mypw) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("틀렸습니다");
		}
		sc.close();
	}

}
