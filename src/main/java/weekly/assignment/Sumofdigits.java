package weekly.assignment;

public class Sumofdigits {
	public static void main (String[] args)
	{
		String text = "Tes12Le79af65";
		int sum =0;
		
		char[] digit = text.toCharArray();
		System.out.println(digit);
		for (int i=0; i<digit.length; i++)
		{
		  if(Character.isDigit(digit[i]))
		  {
			
			 sum = sum +  Integer.parseInt(String.valueOf(digit[i])); 
		  }
		}
		System.out.println(sum);
	}

}
