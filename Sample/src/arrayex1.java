import java.io.*;
import java.util.*;
public class arrayex1 {
	public static void main(String[] args) {
		int arr[]=new int[5];
		for(int i=0; i<5; i++) {
			arr[i]=(i+1)*10;
		}
		for(int temp:arr) {
			System.out.println(temp);
		}
		for (int z=0; z<arr.length; z++) {
			System.out.println(arr[z]);
		}
		
	}
	
}

