package algorismProject1;

import java.util.*;

public class Quicksort_Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 :");
		int studentnum = sc.nextInt();
		int arr[] = new int[studentnum];
		int t=1;
		for (int i = 0; i < studentnum; i++) {
			System.out.print("학생 " + (i + 1) + " 점수 입력 :");
			arr[i] = sc.nextInt();
		}
		
		quicksort(arr,0,studentnum-1);
		System.out.println();
		System.out.println("성적 순으로 정렬");
		for (int i = studentnum-1; i >=0; i--) {
			System.out.println(t +"등 : "+ arr[i]);
			t++;
		}
	}

	static void quicksort(int arr[], int start, int end){
		
		if(start>=end) {
			return;
		}
		
		int pivot = start;
		int i= start+1;
		int z= end;
		int temp;
		
		while(i<=z) {
			while(i<=end && arr[i]<arr[pivot]) {
				i++;
			}
			while(z>start && arr[z] >= arr[pivot]) {
				z--;
			}
			if(i > z) {
				temp = arr[z];
				arr[z] = arr[pivot];
				arr[pivot] = temp;				
			} else {
				temp = arr[i];
				arr[i] = arr[z];
				arr[z] = temp;
			}
		}
		quicksort(arr, start, z-1);
		quicksort(arr, z+1, end);
	}
}

