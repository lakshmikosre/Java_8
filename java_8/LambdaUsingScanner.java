package java_8;

import java.util.Scanner;

interface InterFace3{
	public abstract void m1(int a,int b);
	public default void m2()
	{
		System.out.println("Lambda Function Over");
	}
	
}

public class LambdaUsingScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		InterFace3 i = (x,y)->{System.out.println(x+y);};
        i.m1(a, b);
        i.m2();
        
        sc.close();
	}

}
