package java8_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		   
		Set<Integer> set = new TreeSet<>();
		set.add(90);
		set.add(45);
		set.add(98);
		set.add(59);
		set.add(34);
		set.add(52);
		
		System.out.println("Before manual Sorting  :  " + set );
		
		Set<Integer> set2 = new TreeSet<>((a , b)  -> b  - a );
		set2.add(90);
		set2.add(45);
		set2.add(98);
		set2.add(59);
		set2.add(34);
		set2.add(52);
		
		System.out.println("After manual Sorting desc  :  " + set2 );

	}

}
