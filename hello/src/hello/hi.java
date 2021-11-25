package hello;

import java.util.*;
import java.io.*;

public class hi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 경로(Path) 폴더의 위치. 파일의 위치. 한줄의 문자열로 표현하는걸 경로라고함.
		// 파일 입출력 스트림을 열어주자
		//FileOutputStream output = new FileOutputStream("C:\\CODE\\sample.txt");
		FileWriter fw = new FileWriter("C:\\CODE\\sample.txt");
		fw.write("ㅁㄴㅇㄹㄴㅇㄹㄴㅇㄹ");
		fw.close();
	
	//	output.write("강성우는 천재".getBytes());
		//output.close();

	}

}
