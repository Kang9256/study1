import java.util.Arrays;

public class ssdfsdf {
	
	// �⺻�� �Ű����� ����
	static void primitive_method(int a, int b) {
		System.out.printf("BEFORE a: [%d], b:[%d]\n", a, b);
		int tmp = b;
		b = a;
		a = tmp;
		System.out.printf("AFTER a: [%d], b:[%d]\n", a, b);
	}
	
	// ������ �Ű����� ����
	static void reference_method(int [] arr) {
		// ���޹��� �迭�� ��ȭ
		Arrays.sort( arr );
		System.out.print("sub method: ");
		System.out.println( Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		primitive_method(a, b);
		
		// main �޼����� a, b�� ���� ������ ���� �ʽ��ϴ�
		System.out.printf("MAIN a: [%d], b:[%d]\n", a, b);
		
		int[] arr = { 5, 4, 3, 2, 1 };
		System.out.print("�Լ� ȣ���ϱ� ��: ");
		System.out.println(Arrays.toString(arr));
		reference_method( arr );
		System.out.print("�Լ��� ȣ���� ��: ");
		System.out.println(Arrays.toString(arr));

	}
}