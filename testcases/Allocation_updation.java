package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.Count;
import com.selenium.actions.SignIn;
import com.selenium.common.Buttons;
import com.selenium.pageobject.Dev_Module;

public class Allocation_updation {
	public WebDriver driver;
	@BeforeTest
	 public void f1()
	{
		driver = new FirefoxDriver();
		SignIn.Execute(driver, "bidarapmc", "vsspl");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Dev_Module.Development_module(driver);
		Dev_Module.Work_allocation(driver);
		 //driver.switchTo().frame("4008_IFrame");
		
	}
	@Test
	public void f()throws Exception
	{
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img[@class='x-form-trigger x-form-date-trigger ']")).click();
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[7]/a/em/span[contains(text(),'1')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Show Details')]")).click();
		 
		 
	driver.findElement(By.xpath("//table/tbody/tr/td[3]/div[contains(text(),'Shops creation')]")).click();
		 
		 Buttons.editRecord(driver);
      	Count.cnt(driver);	
      	
	}	

}
