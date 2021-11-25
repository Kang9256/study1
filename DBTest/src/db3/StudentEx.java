package db3;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		StudentDAO stdDAO = new StudentDAO();
		
		System.out.println("�й� �Է�:");
		String stdNo = sc.nextLine();
		
		System.out.println("���� �Է�:");
		String stdName = sc.nextLine();
		
		System.out.println("�г� �Է�:");
		int stdYear = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("�ּ� �Է�:");
		String stdAddress = sc.nextLine();
		
		System.out.println("������� �Է�:");
		String stdBirthday = sc.nextLine();
		
		System.out.println("�а���ȣ �Է�:");
		String dptNo = sc.nextLine();
		
		StudentDTO stdDTO = new StudentDTO(stdNo,stdName,stdYear,stdAddress,stdBirthday,dptNo);

		stdDAO.insertStudent(stdDTO);
		
		stdDAO.selectStudent();
	}

}
