package vishalini.home.testprograms;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String test = "Vishalini is";
        String reverseStr = "";
        char[] data = test.toCharArray();
		for ( int i=test.length()-1; i>=0 ; i--) {
			reverseStr = reverseStr.concat(String.valueOf(data[i]));
		}
        System.out.println(reverseStr );
	}

}
