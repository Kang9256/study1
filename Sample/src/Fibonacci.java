import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		for(int i=1; i<=choice; i++) {
			System.out.print(fibonacci(i)+" ");
		}
		
		}
	
	public static int fibonacci(int n) {
		if(n==1 || n==2) return 1;
		else return fibonacci(n-2) + fibonacci(n-1);
	}

}
