package ArrayListEX;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>(5);
		
		Employee e1 =new Employee(100, "碍己快", 3000.55);
		Employee e2 =new Employee(200, "坷技全", 4000.55);
		Employee e3 =new Employee(300, "辣锐蛮", 5000.55);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());
	}

}
