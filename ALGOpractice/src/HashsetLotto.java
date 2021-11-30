import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashsetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set= new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int) ((Math.random()*45) +1);
			set.add(num);
		}
		System.out.println(set);
		
		List list = new LinkedList (set);
		
		System.out.println("list :"+ sort.list);
	}

}
