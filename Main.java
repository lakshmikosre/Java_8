package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		List<Integer>list = new ArrayList<Integer>();
		list.add(90);
		list.add(20);
		list.add(35);
		list.add(60);
		Collections.sort(list, (a,b)-> b-a); // Comparator using lambda expression
		System.out.println(list);

	}

}
