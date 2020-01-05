package day2.classroom.str;

public class CharacterOccurance {
	public static void main (String[] args)
	
	{
		String test = "I am getting better with Java";
		
		char ch = 'I';
		int totalCount = 0;
		
		char[] data = test.toCharArray();
		for (int i=0; i <data.length ; i++ )
		{
			if(data[i]==ch)
			{
				totalCount++;
				System.out.println(totalCount);
		}
		}
	}

}
