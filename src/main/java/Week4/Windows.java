package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[.='Open Multiple Windows']").click();
		Set<String> windowsHandles = driver.getWindowHandles();
		List<String> lstwindowsHandles = new ArrayList<String>(windowsHandles);
		System.out.println(lstwindowsHandles.size());
		String lastwindow = lstwindowsHandles.get(lstwindowsHandles.size()-1);
		driver.switchTo().window(lastwindow);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
