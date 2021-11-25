import java.util.*;

/*
 * 
 * ������ Ŭ������ ����
 * ȣ���̰� ������ ���� ���̷� �ְ�
 * �����̰� ������ �ٳ����� ���̷� �ְ� ..
 * 
 */

// ���� Ŭ������ ����
class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}

//�������̽��� ������ ���ô�
interface Ground {
	
}

interface Birds {
	public String getAction();
}

interface Foodable {
	public void food();
}


class Tiger extends Animal implements Ground, Foodable{
	public void food() { System.out.println("��");}
}

class Monkey extends Animal implements Ground, Foodable{
	public void food() { System.out.println("�ٳ���");}
}

class Lion extends Animal implements Ground, Foodable {
	public void food() { System.out.println("�Ұ��");}
}

class Eagle extends Animal implements Birds, Foodable {
	public String getAction() { return "Fly"; }
	public void food() { System.out.println("������");}
}

class Duck extends Animal implements Birds, Foodable {
	public String getAction() { return "Fly"; }
	public void food() { System.out.println("�����");}
}

class Tazo extends Animal implements Birds, Foodable {
	public String getAction() { return "Walk"; }
	public void food() { System.out.println("���");}
}


// ������ Ŭ������ ����
class Zoo {
	
	public void action( Ground ground ) {
		System.out.println("Walk");
	}
	
	public void action( Birds bird ) {
		System.out.println(bird.getAction());
	}
	
//	public void food( Animal animal ) {
//		// ������ ���� ������ �ٸ��� ǥ��
//		// ��ü������ �Ʒ��� ���� �ڵ尡 �þ�� ���� �������� �ʽ��ϴ�. 
//		if ( animal instanceof Tiger ) System.out.println("��");
//		else if ( animal instanceof Monkey ) System.out.println("�ٳ���");
//		else if ( animal instanceof Lion ) System.out.println("�Ұ��");
//		else if ( animal instanceof Eagle) System.out.println("������");
//		
//	}
	public void food( Foodable animal ) {
		animal.food();
	}
}


public class Lecture {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Tiger tiger = new Tiger();
		Monkey monkey = new Monkey();
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		Duck duck = new Duck();
		Tazo tazo = new Tazo();
		
		
		zoo.action( tiger );
		zoo.action( monkey );
		zoo.action( lion );
		zoo.action(duck);
		zoo.action(eagle);
		zoo.action(tazo);
		
		zoo.food(tiger);
		zoo.food(monkey);
	}
}