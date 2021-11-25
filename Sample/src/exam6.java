import java.util.*;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test = 456187941;
		String cc="강성우는 천재다 하하";
		String some1[] = cc.split(" ");
		System.out.println(some1[1]);
		String change = Integer.toString(test);
		int count = change.length();
		char arr1[]= new char[count];
		for(int z=0; z<count; z++) {
			arr1[z]=change.charAt(z);
			System.out.println(arr1[z]);
		}
	}
}
