package runner;

import org.testng.annotations.BeforeTest;

import commonMethods.BaseClass;
import cucumber.api.CucumberOptions;
@CucumberOptions(features="src/test/java/features/Login.feature",
				 glue="com/pages",
				 monochrome=true)

public class TC01_LoginPage extends BaseClass {
	@BeforeTest
	public void setData() {
		testcaseName="Login Orange HRM (Cucumber)";
		testcaseDec = "Login and Logout to Leaftaps";
		author="Vidhyananth";
		category="smoke";
		
	}
	

}
