package day1.classroom;

public class Mobile {
	public long makecall()
	{
		System.out.println("number dialed");
		return 91547632452L;
	}
	public String sendSMS()
	{
		System.out.println("Send sms");
		return "Hello";
	}
	public boolean shutdown()
	{
		System.out.println("mobile shutdowned");
		return true;
	}

public static void main (String[] args)
{
	Mobile vish = new Mobile();
	
	long abc =  vish.makecall();
	System.out.println("successfully called " + abc);
	String xyz = vish.sendSMS();
	System.out.println("Message sent " + xyz);
	boolean kei = vish.shutdown();
	System.out.println("Check status " + kei);
	
}
    
   
}