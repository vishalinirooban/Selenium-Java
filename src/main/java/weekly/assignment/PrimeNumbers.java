package weekly.assignment;

public class PrimeNumbers {


		public static void main(String[] args) {
			//Declare an int variable range with value 100
			int range = 100;
			//Declare another int variable for counting
			
			
			
			for(int i= 1; i <= range ; i++)
			{
				int count =0;
				for (int j=1 ; j >=1; j++)
				{
				if(i%j==0)
				{
				count=count+1;
				}
				 if(count==2)
				 {
				
                 System.out.println(i); 
		
}
}
			}
		}
}