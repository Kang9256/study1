package hello;

import java.util.*;
import java.io.*;

public class hi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ���(Path) ������ ��ġ. ������ ��ġ. ������ ���ڿ��� ǥ���ϴ°� ��ζ����.
		// ���� ����� ��Ʈ���� ��������
		//FileOutputStream output = new FileOutputStream("C:\\CODE\\sample.txt");
		FileWriter fw = new FileWriter("C:\\CODE\\sample.txt");
		fw.write("��������������������");
		fw.close();
	
	//	output.write("������� õ��".getBytes());
		//output.close();

	}

}
