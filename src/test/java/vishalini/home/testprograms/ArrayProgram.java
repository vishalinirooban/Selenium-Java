package vishalini.home.testprograms;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
		
		
		int[] arrayVal = {11, 12, 13, 14, 15, 16, 18, 17, 19, 20, 88, 99, 77, 55};
		int leavestart = 3 ;
		
		
		
		
		
		int i = arrayVal.length + leavestart;    //  start
		while (i < arrayVal.length+ leavestart)   //end
		{
			System.out.println(arrayVal[i]);
			
			i++;
		}
		
	}

}
