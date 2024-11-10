package java8_Streams;

public class Imperative {

	public static void main(String[] args) {
	   
		int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
		int sum = 0;
		
		for(int i = 0; i < arr.length;  i++)
		{
			if(arr[i] % 2 == 0)
			{
				sum += arr[i];
//				System.out.println(arr[i]);
				
				System.out.println(sum);
			}
		}
		
		/// This is an imperative method

	}

}
