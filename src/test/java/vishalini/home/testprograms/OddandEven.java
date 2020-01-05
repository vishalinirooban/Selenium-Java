package vishalini.home.testprograms;

public class OddandEven {
	public static void main (String[] args)
	{
		int[] array = {1,2,5,6,3,2};
		
		for (int i=0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.println("Even number IS "+ array[i] );
				
			}
			else 
			{
				System.out.println("Odd number IS " + array[i]);
			}
		
		
		}
		
		
		
		
	}
	

}
