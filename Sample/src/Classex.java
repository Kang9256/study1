import java.io.*;
import java.util.*;
class Subject{
	String name;
	int score;
}
class Student{
	String name;
	Subject subjectArray[];
	Student(){
		
	}
	Student(String a){
		this.name= a;
		this.subjectArray = new Subject[3];
	}
}
public class Classex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu[]= new Student[3];
		for(int i=0; i<stu.length; i++) {
			stu[i]=new Student();
		}
		System.out.println(Arrays.toString(stu));
		stu[0]= new Student("°­¼º¿ì");
		for(Student ss : stu) {
		System.out.printf("%s\n", ss.name);
		}
		Student kang=null;
		
		for(int i=0; i< stu.length; i++) {
			kang.subjectArray[i]= new Subject();
		}
	}
}
