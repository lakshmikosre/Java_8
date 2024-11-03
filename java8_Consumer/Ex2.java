package java8_Consumer;

import java.util.function.Consumer;

public class Ex2 {

	public static void main(String[] args) {
	    
		Consumer<String> upperCase = str1 -> System.out.println(str1.toUpperCase());
		
		Consumer<String> lowerCase = str2 -> System.out.println(str2.toLowerCase());
		
		 upperCase.accept("Hello World");
		 
		 lowerCase.accept("Namaskar DUNIYA");

	}

}
