import java.io.*;
import java.util.*;
/*
 * # �α���[1�ܰ�]
 * 
 * 1. Id�� Pw�� �Է¹޴´�.
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
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
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�");
		}
		sc.close();
	}

}
