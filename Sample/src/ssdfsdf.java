import java.util.Arrays;

public class ssdfsdf {
	
	// 기본형 매개변수 예제
	static void primitive_method(int a, int b) {
		System.out.printf("BEFORE a: [%d], b:[%d]\n", a, b);
		int tmp = b;
		b = a;
		a = tmp;
		System.out.printf("AFTER a: [%d], b:[%d]\n", a, b);
	}
	
	// 참조형 매개변수 예제
	static void reference_method(int [] arr) {
		// 전달받은 배열에 변화
		Arrays.sort( arr );
		System.out.print("sub method: ");
		System.out.println( Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		primitive_method(a, b);
		
		// main 메서드의 a, b는 전혀 영향을 받지 않습니다
		System.out.printf("MAIN a: [%d], b:[%d]\n", a, b);
		
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.print("함수 호출하기 전: ");
		System.out.println(Arrays.toString(arr));
		reference_method( arr );
		System.out.print("함수를 호출한 후: ");
		System.out.println(Arrays.toString(arr));

	}
}