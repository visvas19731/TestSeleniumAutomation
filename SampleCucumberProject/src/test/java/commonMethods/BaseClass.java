package commonMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.OrangeHRM.Utiliites.Reporter;
import com.OrangeHRM.Utiliites.Utilities;

public class BaseClass extends Reporter  {
	
	public static ChromeDriver driver;
	
@BeforeMethod
public void LaunchApp() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String baseURL ="https://opensource-demo.orangehrmlive.com/";
	
	driver.get(baseURL);
	
	//Maximize the window
	
	driver.manage().window().maximize();
	
	
	//Title
	
	String title = driver.getTitle();
	System.out.println("Title of the page is:" +title);
	
	
}

@DataProvider (name ="getdata")
public Object[][] getlogindata() throws IOException {
	
	return Utilities.exceldataread();
	
}



@AfterMethod
public void teardown() {
	driver.close();
}


}
