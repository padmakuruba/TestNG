package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.SignIn;
import com.selenium.pageobject.Dev_Module;

public class Yard_Maintenance {
	
	public WebDriver driver;
	@BeforeTest
	public void login()throws Exception
	{
		driver=new FirefoxDriver();
		SignIn.Execute(driver, "bidarapmc", "vsspl");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Dev_Module.Development_module(driver);
		Dev_Module.Yard_maintenance(driver);
		driver.switchTo().frame("");
	}
}
