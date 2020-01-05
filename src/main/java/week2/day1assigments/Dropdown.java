package week2.day1assigments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
        
        driver.manage().window().maximize();
        
        WebElement usingindex =  driver.findElementById("dropdown1");
        Select ioption = new Select(usingindex);
        ioption.selectByIndex(2);
        
        WebElement usingtext =  driver.findElementByName("dropdown2");
        Select toption = new Select(usingtext);
        toption.selectByVisibleText("Loadrunner");        
        
        WebElement usingvalue =  driver.findElementById("dropdown3");
        Select voption = new Select(usingvalue);
        voption.selectByValue("3");
        
        WebElement usingsize = driver.findElementByClassName("dropdown");
        Select dd = new Select(usingsize);
        List<WebElement> options = dd.getOptions();
        int option = options.size();
        dd.selectByIndex(option-1);
       // for (int i=0 ; i < option ; i++)
        //{
        	//System.out.println(options.get(i).getText());
        //}
        
       // driver.findElementByXPath("//select[text()=''[5]]");
        
        Select dd1 = new Select(driver.findElementByXPath("//select[@multiple]"));
        List<WebElement> options1 = dd1.getOptions();
        int option1 = options1.size();
        dd1.selectByIndex(option1-2);
       for (int i=0 ; i < option1 ; i++)
            {
            	System.out.println(options.get(i).getText());
            }
        
       WebElement data =(driver.findElementByXPath("//select[@]"));
       Select dd2 = new Select(data);
       dd2.selectByValue("Selenium");
       
       
        
	}
}
