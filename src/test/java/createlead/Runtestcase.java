package createlead;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature/login.feature", glue="stepdefinition",monochrome=true)
public class Runtestcase extends AbstractTestNGCucumberTests {

}
