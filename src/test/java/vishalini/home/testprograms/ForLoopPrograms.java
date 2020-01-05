package vishalini.home.testprograms;

public class ForLoopPrograms {

	public static void main(String[] args) 
	{
		
//		//for (int i = 120 ; i  >= 100 ; i--)
//		{
//		
//		
//		//System.out.println("Output " + i );
//	}
//		
//	
		
		
//		int i =120;
//		while (i>=100)
//		{
//		
//		System.out.println(i);	
//			
//		i--;	
//		}
//	
//	
//	 //for (int i = 77 ; i <= 88 ; i++) 
//	{
//		//System.out.println("output " + i);
//	}
//	
//	for (int i = 12 ; i < 18 ; i++)
//	{
//		System.out.println("Output " +i );
//		
//	}
//	System.out.println("*******");
//	
//	//for (int i=82 ; i > 66 ; i--)
//	{
//		//System.out.println("output" + i);
//	}
//   
//	for ( int i = 185 ; i >= 180 ; i-- )
//	{
//		if (i==185)
//		{
//			System.out.println("Hai");
//		}
//		else if(i>182)
//		{
//			System.out.println("output" + i);
//			
//		}
//		else {
//			System.out.println("hello");
//		}
//	}
//	    int num=0;   
//		for ( int i = 80 ; i <= 200 ; i++)
//		{
//		num=num+i;
//		}
//		System.out.println("output " + num);
//		
//		//int input=1528;
//		int output = 0;
//		for (int i=1528; i > 0 ; i= i / 10)
//		{
//			output = i%10 + output;
//		}
//		
//		System.out.println("print result" + output);
//	  
		
		int i=1528;
		int output = 0;
		while (i>0)
		{
		output = i%10 + output;	
			
		i = i /10;	
		}
		System.out.println(output);
	}
		
		
	
    
}

