package java_8;


interface Inter{
	static void sayHello() {
		System.out.println("Hello");
	}
}
public class StaticMethod implements Inter{

	public static void main(String[] args) {
		
		 StaticMethod sm = new  StaticMethod();
		 
//		 sm.sayHello();  we cannot call static method by any reference obj or implemented class
		 
		 Inter.sayHello(); // we can call static method only by its instance of a class


		 
	}

}
