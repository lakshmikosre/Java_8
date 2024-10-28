package java8_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		    
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		Collections.sort(list , (a , b) -> b .compareTo (a));
		System.out.println("Descending Order : - " +list);
		
		Collections.sort(list , (a , b) -> a.compareTo (b));
		System.out.println( "Ascending Order : - "+ list);

	}

}
