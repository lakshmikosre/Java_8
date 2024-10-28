package java8_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2  {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(89);
		list.add(58);
		list.add(40);
		list.add(67);
		
		Collections.sort(list , (a ,b) -> a  -  b);   //  Ascending order
		System.out.println("Ascending order : -  " + list);
		Collections.sort(list , (a , b) -> b  -  a);
		System.out.println("Descending order : - " + list);
		
	}

}
