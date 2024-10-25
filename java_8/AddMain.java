package java_8;


interface Addition{
	String getName ();
}
public class AddMain{
	public static void main(String[] args) {
		
		Addition se = ()-> "Software Engineer";
		System.out.println(se.getName());
		
		Addition sde = ()->"Software Developer";
		System.out.println(sde.getName());
	}
}
