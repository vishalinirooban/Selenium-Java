package weekly.assignment;

public class Palindrome {
public static void main(String[] args)
{
	String text = "keisha";
	//Declare another String rev
	String rev = "";
	
	System.out.println(text);
	
	for (int i=text.length()-1; i>=0;i--)
	{
		rev = rev + text.charAt(i);
		System.out.println(rev);
	
	}
	if(text.equals(rev))
	{
		System.out.println("It is an palindrome");
	}
	else
	{
		System.out.println("it is not an palindrome");
	}
}
}
