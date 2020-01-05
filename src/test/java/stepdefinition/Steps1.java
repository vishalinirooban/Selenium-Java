package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps1 {

	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchTheBrowser() {
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
	}

	@Given("Maximise the browser")
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();

	}

	@Given("Load the url")
	public void loadTheUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter the username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String username) {
		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String password) {
		driver.findElementById("password").sendKeys(password);
	}

	@When("Click on the login buttn")
	public void clickOnTheLoginButtn() {
		driver.findElementByClassName("decorativeSubmit").click();
	   
	}

	@Then("verify login is sucessfull")
	public void verifyLoginIsSucessfull() {
		System.out.println("success");
	    
	}

	@And("Click on the CRM/SFA link")
	public void clickOnTheCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Then("verify it navigates to nextpage")
	public void verifyItNavigatesToNextpage() {
	    System.out.println("success");
	}

	@When("click on Lead button")
	public void clickOnLeadButton() {
		driver.findElementByLinkText("Leads").click();
	}

	@Then("click on create Lead")
	public void clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Then("Enter the (.*)")
	public void enterTheCompanyname(String compname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
	}

	@Then("Enter the (.*)")
	public void enterTheFirstname(String firstname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
	}

	@Then("Enter the (.*)")
	public void enterTheLastname(String Lastname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lastname);
	}

	@Then("click on create Lead submit button")
	public void clickOnCreateLeadSubmitButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
    
	@Then("Verify lead is created successfully")
	public void verify_lead_is_created_successfully() {
	   System.out.println("sucess");
	}


}