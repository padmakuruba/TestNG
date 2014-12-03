package com.selenium.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Count {
	public static WebDriver driver;
	public static WebElement element=null;
	static String drop;
	static String work_name="Street Lights";
	static boolean flag;
	public static List<WebElement> cnt(WebDriver driver)
	{
		//Dropdown.work_name(driver);
		List<WebElement> element =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		 int num = element.size();
		 System.out.println("count="+num);
		 for(int i=1;i<=num;i++)
		 {
			drop=driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
			
			if(drop.equals(work_name))
			{
				driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
				driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
				flag=true;
				break;
			}
			
		 }
		 if(flag)
		 {
			 System.out.println("found"+drop);
		 }
		 else
		 {
			 System.out.println("not found");
		 }
		 
		 return element;
		 
	}
	public static WebElement dropdown_option(WebDriver driver)
	{
	WebElement element = driver.findElement(By.xpath("//div[@class='x-combo-list-inner']"));
	 String str = element.getText();
    System.out.println("Dropdown count is:-- "+str);
    if(str.contains(work_name))
    {
   	 System.out.println("string found");
    }
    else
    {
   	 System.out.println("not found");
    }
    return element;
	}
	public static List<WebElement> wp_cnt(WebDriver driver)
	{
		Dropdown.work_name(driver);
		List<WebElement> element =driver.findElements(By.xpath("//div[@class='x-combo-list-inner']/div"));
		 int num = element.size();
		 System.out.println("count="+num);
		 for(int i=1;i<=num;i++)
		 {
			drop=driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
			
			if(drop.equals(work_name))
			{
				driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).getText();
				driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div["+i+"]")).click();
				flag=true;
				break;
			}
			
		 }
		 if(flag)
		 {
			 System.out.println("found"+drop);
		 }
		 else
		 {
			 System.out.println("not found");
		 }
		 
		 return element;
		 
	}
	
}
