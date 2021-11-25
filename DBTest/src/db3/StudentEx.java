package db3;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		StudentDAO stdDAO = new StudentDAO();
		
		System.out.println("학번 입력:");
		String stdNo = sc.nextLine();
		
		System.out.println("성명 입력:");
		String stdName = sc.nextLine();
		
		System.out.println("학년 입력:");
		int stdYear = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("주소 입력:");
		String stdAddress = sc.nextLine();
		
		System.out.println("생년월일 입력:");
		String stdBirthday = sc.nextLine();
		
		System.out.println("학과번호 입력:");
		String dptNo = sc.nextLine();
		
		StudentDTO stdDTO = new StudentDTO(stdNo,stdName,stdYear,stdAddress,stdBirthday,dptNo);

		stdDAO.insertStudent(stdDTO);
		
		stdDAO.selectStudent();
	}

}
