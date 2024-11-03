package java8_Consumer;

// Consumer Interface

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exp1 {

	public static void main(String[] args) {
		
		Consumer<List<Integer>> listConsumer1 = li -> {
			for(Integer i : li)
			{
				System.out.println(i + 200);
			}
		};
		
		Consumer<List<Integer>> listConsumer2 = li -> {
			for(Integer i : li)
			{
				System.out.println(i);
			}
		};
		
		Consumer<List<Integer>> listConsumer = listConsumer1 .andThen(listConsumer2);
		
		System.out.println("      ");
		listConsumer.accept(Arrays.asList(1,2,3,4,5));

	}

}
