import java.util.Arrays;

public class randddd {
	static int method(int a, int b) {
		return a+b;
	}
	static void sooort(int arr[]) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));	
	}
	
	public static void main(String[] args) {
		System.out.println(method(3,4));
		int arr[]= {4,5,7,8,4,1,2};
		sooort(arr);
	
}
}
