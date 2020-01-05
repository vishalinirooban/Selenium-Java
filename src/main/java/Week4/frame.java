package Week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("vishalini");
		alert.dismiss();
		String  text = driver.findElementById("demo").getText();
		System.out.println(text);
		if(text.contains("vishalini"))
				{
			System.out.println("sucess");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
