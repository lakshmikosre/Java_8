package java_8;

@FunctionalInterface
interface DemoInterface
{
	public abstract void m1(int a , int b);
	public default void m2()
	{
		System.out.println("Interface Default Method");
	}
}

public class Functional_Interface {

	public static void main(String[] args) {
		
		DemoInterface p = (int a , int b) -> {System.out.println("Addition of a + b = " +(a+b));};
		
		p.m1(30,70);

	}

}
