import java.io.*;
import java.util.*;
public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int count=0;
		for(int i=2; i<=temp; i++) {
			if(temp%i==0) {
				count++;
			}
			if(count==2) {
				System.out.printf("%d �� �Ҽ��Դϴ�.\n", temp);
			}
			else {
				System.out.printf("%d �� �Ҽ��� �ƴմϴ�.\n", temp);
			}
			temp--;
		}
		
	}

}
