import java.util.*;
import java.io.*;
public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int str=123; String temp = Integer.toString(str); String str1="123"; String
		 * sum1=str1+1; System.out.println(sum1); int temp1= Integer.valueOf(str1); int
		 * sum2= temp1+1; System.out.println(sum2);
		 */
		
		String str= "±èÃ¶¼ö, ÀÌ¸¸¼ö, ÀÌ¿µÈñ";
		String temp[]= str.split(",");
		System.out.println(temp[2]);
		System.out.println(Arrays.toString(temp));
		String str2[] = {"°­","±è","°¡"};
		Arrays.sort(str2);
		for(String st : str2) {
		System.out.println(st);
		}
	}

}
