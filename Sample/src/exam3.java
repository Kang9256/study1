import java.io.*;
import java.util.*;

class Animal{
	void walk() {
		System.out.println("새가 걷고 있다");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("새가 날고 있다");
	}
}

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	}

}
