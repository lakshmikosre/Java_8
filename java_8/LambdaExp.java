package java_8;



@FunctionalInterface
interface DemoInterFace2{
	
	public abstract  void m1(int a , int b); // we can create only one abstract method in lambda expression
	
	public default void m2(int c,int d) 
	{
		System.out.println(c+d);
	}
}
public class LambdaExp {

	public static void main(String[] args) {
		
		DemoInterFace2 d = ( int a,int b )->{System.out.println(a+b);};
		d.m1(12,45);
		d.m2(50,60);
    
	} 
	
}
