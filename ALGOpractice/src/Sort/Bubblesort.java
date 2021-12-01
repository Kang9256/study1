package Sort;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,8,3,1};
		bubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static void bubbleSort(int arr[]) {
		int temp;
		for(int i=1; i<arr.length; i++) {
			for(int z=0; z<arr.length-i; z++) {
				if(arr[z]>arr[z+1]) {
					temp = arr[z];
					arr[z]=arr[z+1];
					arr[z+1]=temp;
				}
			
		}
	}
	}
}
