import java.util.*;

/*
 * 
 * 동물원 클래스를 가정
 * 호랑이가 들어오면 닭을 먹이로 주고
 * 원숭이가 들어오면 바나나를 먹이로 주고 ..
 * 
 */

// 동물 클래스를 정의
class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}

//인터페이스를 도입해 봅시다
interface Ground {
	
}

interface Birds {
	public String getAction();
}

interface Foodable {
	public void food();
}


class Tiger extends Animal implements Ground, Foodable{
	public void food() { System.out.println("닭");}
}

class Monkey extends Animal implements Ground, Foodable{
	public void food() { System.out.println("바나나");}
}

class Lion extends Animal implements Ground, Foodable {
	public void food() { System.out.println("소고기");}
}

class Eagle extends Animal implements Birds, Foodable {
	public String getAction() { return "Fly"; }
	public void food() { System.out.println("지렁이");}
}

class Duck extends Animal implements Birds, Foodable {
	public String getAction() { return "Fly"; }
	public void food() { System.out.println("물고기");}
}

class Tazo extends Animal implements Birds, Foodable {
	public String getAction() { return "Walk"; }
	public void food() { System.out.println("사료");}
}


// 동물원 클래스를 정의
class Zoo {
	
	public void action( Ground ground ) {
		System.out.println("Walk");
	}
	
	public void action( Birds bird ) {
		System.out.println(bird.getAction());
	}
	
//	public void food( Animal animal ) {
//		// 동물에 따라서 음식을 다르게 표현
//		// 객체지향은 아래와 같이 코드가 늘어나는 것을 좋아하지 않습니다. 
//		if ( animal instanceof Tiger ) System.out.println("닭");
//		else if ( animal instanceof Monkey ) System.out.println("바나나");
//		else if ( animal instanceof Lion ) System.out.println("소고기");
//		else if ( animal instanceof Eagle) System.out.println("지렁이");
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