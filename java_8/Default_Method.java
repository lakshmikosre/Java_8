package java_8;

 interface Parent{
	  default void sayHello()
	  {
		  System.out.println("Say Hello");
	  }  
}
 class Child implements Parent{
	 @Override
	 public void sayHello(){
	 System.out.println("Child Says Bye");
	 }
 }
public class Default_Method implements Parent {

	public static void main(String[] args) {
		    
		 Parent c = new Child();
		 c.sayHello();
		 
		 Default_Method dm = new Default_Method();
		 dm.sayHello();
	}
    
	public void sayHello() {
		Parent.super.sayHello();
      }  
}
