package weekly2assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FLIPKART {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("http://www.flipkart.com");

		// Maximize the browser
         driver.manage().window().maximize();
         
          
           
          //WebElement electronic =driver.findElementByXPath("//span[text()='Electronics']");
          //Thread.sleep(3000)
          
          //WebElement mi=driver.findElementByXPath("//a[text()='Mi']");
          //builder.moveToElement(electronic);
          //Thread.sleep(3000);
          
         // builder.click(mi).perform();
         Thread.sleep(3000);
         
         driver.findElementByXPath("//div[@class='_39M2dM JB4AMj']/input[1]").sendKeys("9629020262");
         Thread.sleep(3000);
         driver.findElementByXPath("//div[@class='puBGSV']/button").click();
         

         driver.findElementByXPath("//button[text()='✕']").click();
         Actions builder = new Actions(driver);
         Thread.sleep(3000);
         
         driver.findElementByXPath("//div[@class='O8ZS_U']/input").sendKeys("MOBILES");
         driver.findElementByXPath("//div[@class='col-12-12 _2tVp4j']/button").click();
         Thread.sleep(6000);
         driver.findElementByXPath("(//div[@class='_3wU53n'])[6]").click();
         
        // Thread.sleep(9000);
         Thread.sleep(3000);
       driver.findElementByXPath("(//div[@class='bhgxx2 col-12-12'])[2]/li[1]").click();
      // driver.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button").click();
        // Thread.sleep(1000);
        
	}
}
