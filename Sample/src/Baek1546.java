import java.util.*;
import java.io.*;

public class Baek1546 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count1= sc.nextInt();
		double arr[]= new double[count1];
		double max=0;
		double sum=0;
		for(int i=0; i<count1; i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {*
				max=arr[i];
			}
		}
		for(int z=0; z<count1; z++) {
			arr[z]=(arr[z]/max*100);
			sum+=arr[z];
		}
		System.out.println(sum/count1);
	}

}
