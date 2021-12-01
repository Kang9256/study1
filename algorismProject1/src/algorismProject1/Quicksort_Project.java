package algorismProject1;

import java.util.*;

public class Quicksort_Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 :");
		int studentnum = sc.nextInt();
		int arr[] = new int[studentnum];

		for (int i = 0; i < studentnum; i++) {
			System.out.print("학생 " + (i + 1) + " 점수 입력 :");
			arr[i] = sc.nextInt();
		}
		
		quicksort(arr,0,studentnum-1);
		
		for (int i = 0; i < studentnum; i++) {
			System.out.println(arr[i]);
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
				
			}
		}
		
	}
}

