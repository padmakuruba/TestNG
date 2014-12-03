package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.selenium.actions.SignIn;
import com.selenium.pageobject.Dev_Module;


public class Grid_reflection {
    public WebDriver driver;
    String Wname="work-2";
  @BeforeTest
  public void Beforegrid() {
      driver= new FirefoxDriver();
      SignIn.Execute(driver, "bidarapmc", "vsspl");
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      }
  @Test
  public void Test1() throws Exception {
        boolean flag=false;
       
        Dev_Module.Development_module(driver);
          Dev_Module.Work_creation(driver);
          driver.switchTo().frame("4007_IFrame");
          Thread.sleep(1000);

      driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[@class='x-btn-text x-tbar-loading']")).click();
      Thread.sleep(1000);
      
      String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[6]/span")).getText();
     
      PageCount = PageCount.replace("of ", "");
      Integer PageCount_int = Integer.parseInt(PageCount);
       System.out.println("pagecount is= "+PageCount);
           Thread.sleep(1000);
      
    
      
//java.util.List<WebElement> count = driver.findElements(By.xpath("//table/tbody/tr/td[@class='x-grid3-col x-grid3-cell x-grid3-td-lblDate ']/div[@class='x-grid3-cell-inner x-grid3-col-lblDate']"));
      java.util.List<WebElement> count =driver.findElements(By.xpath("//div[@class='x-grid3-body']/div/table/tbody/tr/td[2]/div"));
      int Number=count.size();
      System.out.println("Grid count is:-- "+Number);
     for(int j=1;j<=PageCount_int;j++)
     {
      for(int i=1;i<=1;i++){
          String WorkName = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[3]/div")).getText();
           if(WorkName.equals(Wname)){
                  driver.findElement(By.xpath("//div[@class='x-grid3-body']/div["+i+"]/table/tbody/tr/td[3]/div")).click();
                  System.out.println("Record found in the grid: "+Wname);

              flag=true;             
              break;
              }
      
       if(flag){
          System.out.println("Record found in the grid: "+Wname);
           break;
       }
       else{
           driver.findElement(By.xpath("//td/em/button[@class='x-btn-text x-tbar-page-next']")).click();
       }
  }
     }   
      if(!flag){
           System.out.println("Workname not found: "+Wname);

    }
             
       
}
}