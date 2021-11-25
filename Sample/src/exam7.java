import java.util.*;

public class exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int count = 0;
		for (int i = 1; i * 2 <= choice; i++) {
			if (choice % i == 0) {
				count++;
			}
		}
		if (count % 2 == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
