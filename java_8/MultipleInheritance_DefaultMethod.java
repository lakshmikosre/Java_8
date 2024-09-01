package java_8;


interface A {
	
	   default void sayHello() 
	   {
		   
		   System.out.println("A says Hello");
	   }
}
interface B{
	
	default void sayHello()
	{
		System.out.println("B says Hello");
	}
}
public class MultipleInheritance_DefaultMethod implements A , B {

	public static void main(String[] args) {
		
		MultipleInheritance_DefaultMethod dm = new MultipleInheritance_DefaultMethod();
		
		dm.sayHello();
		
	}
	@Override 
	
	public  void sayHello() {
		
	B.super.sayHello();

      }
}
