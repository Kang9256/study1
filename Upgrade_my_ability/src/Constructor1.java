public class Constructor1
{
    public static void main(String[] args) {
        System.out.println("=========");
		Parent p1 = new Parent();
		System.out.println(p1.a);
        System.out.println("=========");
        ChildA c1 = new ChildA();
        System.out.println(c1.a);
        System.out.println("=========");
        ChildB c2 = new ChildB();
	}
}


class Parent {
	int a=0;
    public Parent() {
        System.out.println("Parent ������ ȣ��");
    }

}

class ChildA extends Parent {
	
    public ChildA() {
        System.out.println("Child ������ ȣ��");
        super.a=1;
    }
    
}

class ChildB extends Parent {

}


