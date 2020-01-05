package vishalini.home.testprograms;

public class SunofDigit {
	public static void main (String[] args)
	{
	//input : 1,2,3
	//output : 1+2+3=6
		
		int input = 123;
		
		int sum = 0;
		int rem = 0;
	   
		while(input>=0)
		{
			rem = input % 10;
				System.out.println(rem);
			}
		}
		//System.out.println(sum);
	
	}


