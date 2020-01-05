package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Learnhooks {
	@Before
	public void prescenario(Scenario sc)
	{
		System.out.println("Test name:"+sc.getName());
		System.out.println("Testline number" +sc.getId());
		System.out.println("Test status"+sc.getStatus());
	}
	@After
	public void postscenario(Scenario sc)
	{
		System.out.println(sc.getStatus());
	}

}
