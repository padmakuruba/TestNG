package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import com.selenium.actions.SignIn;
import com.selenium.pageobject.Dev_Module;

public class Grid_Ref {
	public WebDriver driver;
	boolean flag;
	String work_name="Work";
	String work_type="shop";
	String work_date="24-11-14";	
	
	@BeforeTest
	  public void beforeTest() {
		driver=new FirefoxDriver();
		SignIn.Execute(driver, "bidarapmc", "vsspl");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }

	
	@Test
  public void f() throws InterruptedException {
  
		Dev_Module.Development_module(driver);
	Dev_Module.Work_allocation(driver);
		//Dev_Module.Work_creation(driver);
		
		driver.switchTo().frame("4008_IFrame");
		driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[@class='x-btn-text x-tbar-loading']")).click();
		Thread.sleep(2000);
	/*	driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img")).click(); 
		driver.findElement(By.xpath("//table/tbody/tr[4]/td[6]/a/em/span[contains(text(),'21')]")).click(); 
		driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[contains(text(),'Show Details')]")).click();*/
		
		// java.util.List<WebElement> element =driver.findElements(By.xpath("//div[@class='x-panel x-grid-panel']/div[@class='x-grid3-body']/div"));
		java.util.List<WebElement> element =driver.findElements(By.xpath("//div[@class='x-grid3-body']/div/table/tbody/tr/td[2]/div"));
		
		// java.util.List<WebElement> element =driver.findElements(By.xpath("//table/tbody/tr/td[@class='x-grid3-col x-grid3-cell x-grid3-td-lblDate ']/div[@class='x-grid3-cell-inner x-grid3-col-lblDate']"));

		 int num = element.size();
	 System.out.println("count="+num);
		
		for(int i=1;i<=num;i++)
		 {
			/*String work_name1=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[3]/div")).getText();
			System.out.println("work_name="+work_name1);*/
	String work_name1=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[3]/div")).getText();
	//String work_type=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[4]/div")).getText();
	//System.out.println("workname="+work_name1);
	//System.out.println("work_type="+work_type);
	if(work_name1.equals(work_name))
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[3]/div")).click();
        System.out.println("record found");
		flag=true;
		break;
	}
	

		
	        if(flag)
	        {
	            System.out.println("Record Found In Grid");
	        }
	        else
	        {
	    	    driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();

	    	}
		 }    
	        if(!flag)
	        {
	            System.out.println("Workname not found: "+work_name);

	        }
	     }
  
}
