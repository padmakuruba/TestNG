package testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.SignIn;
import com.selenium.common.Buttons;
import com.selenium.pageobject.Dev_Module;

public class Wa_print {
	
	public WebDriver driver;
	String Work_Name ="ghfghf";
	@BeforeTest
	public void f()throws Exception
	{
		driver=new FirefoxDriver();
		SignIn.Execute(driver, "bidarapmc", "vsspl");
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	}
	@Test(enabled=false)
	public void print()throws Exception
	{
		Dev_Module.Development_module(driver);
		Dev_Module.Contractor_bill(driver);
		
		 driver.switchTo().frame("4011_IFrame");
		 
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[contains(text(),'Contractor Bill)]")).click();
		driver.getWindowHandle();
		Thread.sleep(2000);
		//String Wa_Screen =driver.getWindowHandle();
		String Cbp = driver.getWindowHandle();
		
        for(String Print:driver.getWindowHandles())
        {
        	driver.switchTo().window(Print);
        	
        	driver.manage().window().maximize();
        	Thread.sleep(2000);
        }
        driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys(Work_Name);                         
    	driver.findElement(By.xpath("//table/tbody/tr/td/div/img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
    	
    	System.out.println("work Name found in print reports:"+Work_Name);
    	Thread.sleep(2000);
        driver.switchTo().window(Cbp);
    	
        Thread.sleep(2000);
        driver.findElement(By.xpath("li/a[@class='x-tab-strip-close']")).click();
        Buttons.newRecord(driver);
        
        //driver.switchTo().defaultContent();
      // driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[contains(text(),'Contractor Bill')]")).click();
	//driver.findElement(By.xpath("//html/body/form/div[1]/div[2]/div[1]/div/div/div/div/div/div/table/tbody/tr/td[12]/table/tbody/tr/td[2]/em/button")).click();
	}  
        /*for(String Print1:driver.getWindowHandles())
        {
        	driver.switchTo().window(Print1);
        	driver.manage().window().maximize();
        	Thread.sleep(2000);
        }
        
	*/
	@Test(priority=1)
	public void windows()throws Exception
	{

		Dev_Module.Development_module(driver);
		Dev_Module.Contractor_bill(driver);
		//driver.findElement(By.xpath("//div[@class='x-grid3-row  x-grid3-row-first x-grid3-row-last ']")).click();
		 driver.switchTo().frame("4011_IFrame");
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[@class='x-grid3-row  x-grid3-row-first x-grid3-row-last ']")).click();
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-lblWorkName']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//td/table[@id='btnContractorBillPrint']/tbody/tr/td[2]")).click();
		 
		driver.getWindowHandles();
	 Thread.sleep(2000);
	String Cbp=driver.getWindowHandle();
	System.out.println(Cbp);
	//Set<String> handler=driver.getWindowHandles();
	Set<String> AllWindowHandles = driver.getWindowHandles();
	// Handler will have all the three window handles 
	for (String print :driver.getWindowHandles()) 
	{
	driver.switchTo().window(print);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// It will get the Title of each window,
	String var=driver.getTitle();
	System.out.println(var);
	//This will check Windows and not. If it is not the parent window it will close the child window 
/*if(!print.contains(Cbp))
	{
	driver.close();
	}
	else
	{
	System.out.println("it is the main window");
	driver.switchTo().defaultContent();
	
	}	*/
	
	}
	
	driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys(Work_Name);                         
	driver.findElement(By.xpath("//table/tbody/tr/td/div/img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
	
	//System.out.println("work Name found in print reports:"+Work_Name);
	Thread.sleep(2000);
    driver.switchTo().window(Cbp);
    System.out.println(driver.getTitle());
    Thread.sleep(2000);
	
    
 //driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[contains(text(),'Contractor Bill List')]")).click();
    //driver.findElement(By.xpath("//td/table[@id='btnContractorBillPrintNote']/tbody/tr/td[2]")).click();
  //  boolean errorMessageDisplayTest= driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button")).isDisplayed();
  
  /* WebDriverWait wait= new WebDriverWait(driver, 40);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td[2]/em/button[contains(text(),'Contractor Bill List')]"))).click();*/
    
}
	@Test(priority=2)
	public void contactor_billist()throws Exception
	{
		driver.switchTo().frame("4011_IFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td/table[@id='btnContractorBillPrintNote']/tbody/tr/td[2]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Contractor Bill List')]")).click();
		Thread.sleep(2000);
		driver.getWindowHandles();
		String Cbl = driver.getWindowHandle();
		System.out.println(Cbl);
		for (String print1 :driver.getWindowHandles()) 
		{
		driver.switchTo().window(print1);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// It will get the Title of each window,
		
		}
		driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys(Work_Name);                         
		driver.findElement(By.xpath("//table/tbody/tr/td/div/img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
    	
	}
}
