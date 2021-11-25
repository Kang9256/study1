import java.util.*;

public class Baek4344 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count1= sc.nextInt();
		double arr[]= new double[count1];
		double avg=0;
		double sum=0;
		for(int i=0; i<count1; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			}
		avg=sum/count1;
		double count2=0;	
		for(int z=0; z<count1; z++) {
			if(arr[z]>avg) {
				count2++;
		}
	}
		System.out.printf("%.3f"+"%%\n",(count2/count1*100));
}
}

