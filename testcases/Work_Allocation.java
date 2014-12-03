package testcases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.swing.text.BadLocationException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Document;
import com.selenium.actions.Count;
import com.selenium.actions.Date_Picker;
import com.selenium.actions.Dropdown;
import com.selenium.actions.SignIn;
import com.selenium.common.Buttons;
import com.selenium.pageobject.Dev_Module;

import org.apache.commons.io.FileUtils;

public class Work_Allocation {
	public WebDriver driver;
	String work_name = "Work";
	static String drop;
	boolean flag;
	@BeforeTest
	 public void f1()
	{
		driver = new FirefoxDriver();
		SignIn.Execute(driver, "bidarapmc", "vsspl");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Dev_Module.Development_module(driver);
		//driver.findElement(By.xpath("//div/div/div/span[contains(text(),'Development')]"));
		
		Dev_Module.Work_allocation(driver);
		//Dev_Module.Work_progress(driver);
		
		 driver.switchTo().frame("4008_IFrame");
		 
	//	Buttons.newRecord(driver);
	}
	
	@Test(enabled=false)
	public void f() throws IOException
	{
		
		/*Date_Picker.date_selection(driver);
		Date_Picker.month_selection(driver);
		Date_Picker.ok_button(driver);
		//driver.findElement(By.xpath("//table/tbody/tr[7]/td[@colspan='4']/button[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();*/
		Dropdown.contractor_name(driver);
		 
		 
		driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/"
				+ "div[contains(text(),'Contractor')]")).click();
		
		
		//driver.findElement(By.xpath("//em/span[contains(text(),'17')]")).click();
		Dropdown.work_name(driver);
		driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/"
				+ "div[contains(text(),'workname')]")).click();
	
	}
	@Test(enabled=false)
      public void disable()throws Exception
{
		
	/*WebElement Work_Type=driver.findElement(By.id("workAllotmentuserWindow_txtWorkType"));
    boolean enabled=Work_Type.isEnabled();
System.out.println(enabled);   

((JavascriptExecutor) driver).executeScript("document.getElementsByName('workAllotmentuserWindow_txtWorkType')[0].removeAttribute('disabled');");  
System.out.println("After ------ "+Work_Type.isEnabled());
Thread.sleep(2000);
String str=Work_Type.getAttribute("value");
System.out.println("text is : "+str);*/
		
    Date_Picker.work_completion_date(driver);
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       WebDriverWait wait2=new WebDriverWait(driver, 20);
       driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkCompletionDate_Container']/div/img")).click();
       driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[3]/a[@title='Next Month (Control+Right)']")).click();
       driver.findElement(By.xpath("//table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]/a/em/span[contains(text(),'24')]")).click();       
       Dropdown.enginner_name(driver);
       driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/"
				+ "div[contains(text(),'AEE-Bidar')]")).click();
       driver.findElement(By.xpath("//input[@id='workAllotmentuserWindow_txtEMDAmount']")).
sendKeys("5000");
       driver.findElement(By.xpath("//input[@id='workAllotmentuserWindow_txtFSDAmount']")).
       sendKeys("1000");
      Buttons.savebutton(driver);
      Buttons.ok_message_button(driver);
      Buttons.close_buttton(driver);
      
}
	
	/*@Test
	public void work_progress()throws Exception
	{
		
		//driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div[@id='workInProgressuserWindow_cmbWorkName_Container']/div/img")).click();
		Count.cnt(driver);
	}*/
	/*@Test(priority=2)
	public void editing()throws Exception
	{
		//driver.findElement(By.xpath("//table/tbody/tr/td[3]/div[@class='x-form-field-wrap']/img")).click();
		//driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/a/em/span[contains(text(),'2')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Show Details')]")).click();
		 
		 Thread.sleep(1000);
	driver.findElement(By.xpath("//table/tbody/tr/td[3]/div[contains(text(),'Shops creation')]")).click();
		 Thread.sleep(1000);
		 Buttons.editRecord(driver);
      	//Count.cnt(driver);	
      	
	}*/
	
	@Test(enabled=false)
	public void contractor_bill_preparation()throws Exception
	{
		 driver.switchTo().defaultContent();
		Dev_Module.Contractor_bill(driver);
		//Dev_Module.Work_progress(driver);
		
		driver.switchTo().frame("4011_IFrame");
		 
		Buttons.newRecord(driver);
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[@id='contractorBillPreparationuserWindow_cmbWorkName_Container']/div/img")).click();
		Count.cnt(driver);
	}
	/*@Test
	public void g(){
	    String ss=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div/table/tbody/tr/td[2]/div")).getText();
	    driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();

	WebElement sb=driver.findElement(By.xpath("//table/tbody/tr/td[3]/div[contains(text(),'Shops creation')]"));
	sb.click();
	    System.out.println(ss);
		Workbook wb = new HSSFWorkbook();
	    FileOutputStream fileOut = new FileOutputStream("workbook.xls");
	    wb.write(fileOut);
	    fileOut.close();
	}
	
	*/
	
/*	@Test(priority=2)
	public void f3()throws Exception
	{
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]")).click();
        driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]")).click();
        driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]")).click();
        driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
	}*/
	@Test(enabled=false)
	public void print()throws Exception
	{
		driver.findElement(By.xpath("//table[@id='btnWorkAllotmentReport']/tbody/tr/td[2]/em/button")).click();
		driver.getWindowHandles();
		Thread.sleep(2000);
		String WAP=driver.getWindowHandle();
		for(String Print:driver.getWindowHandles())
		{
			driver.switchTo().window(Print);
			Thread.sleep(2000);
			driver.manage().window().maximize();
		}
		driver.findElement(By.xpath("//input[@id='developmentReportsViewer_toptoolbar_search_textField']")).sendKeys("Shops creation");
		driver.findElement(By.xpath("//table/tbody/tr/td/div/img[@id='IconImg_developmentReportsViewer_toptoolbar_search_button']")).click();
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scrFile, new File("\\home\\trishna\\Automation\\padma\\src.jpg")); */

	}
	@Test(enabled=false)
	public void wpdisable()throws Exception
	{
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/div[@id='workInProgressuserWindow_cmbWorkName_Container']/div/img")).click();
		driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/"
				+ "div[contains(text(),'workname')]")).click();
		WebElement cfn=driver.findElement(By.id("workInProgressuserWindow_txtContractorName"));
		boolean enabled=cfn.isEnabled();
		System.out.println(enabled);
		
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('workInProgressuserWindow_txtContractorName')[0].removeAttribute('disabled');"); 
		System.out.println("after enabling : "+cfn.isEnabled());
		Thread.sleep(2000);
		String str = cfn.getAttribute("value");
		System.out.println(str);
	}
	@Test
	public void takeScreenshotOfElement(Object element) throws IOException { 
		
		    try{
		    	driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]")).click();
		        driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]")).click();
		        driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]")).click();
		        driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
		      
		    } catch (Exception e){
		        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		        FileUtils.copyFile(scrFile, new File("/home/trishna/Desktop/screenshots/failure.png")); 
		       
		  }
		}
	
/*@AfterTest
	public void f2()
	{
		driver.close();
	}
  */
	
	
}
