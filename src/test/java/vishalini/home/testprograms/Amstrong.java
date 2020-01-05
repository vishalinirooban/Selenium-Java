package vishalini.home.testprograms;

public class Amstrong {
	
	public static void main(String[] args)
	{
			//Input = 153
		
		int Input = 153;
		int rem;
		
		int cal = 0;
		
		int original =0;
		original=Input;
		
		while (Input>0)
		{
			rem = Input % 10;
			 Input = Input/10;
			 
			 cal = (rem*rem*rem)+cal;
			 
		
		}
		
		     if (cal==original)
		     {
		    	 System.out.println("It is amstrong number" + cal);
		     }
		   
	}

}
