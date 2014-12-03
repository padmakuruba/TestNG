package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Date_Picker {
	public static WebDriver driver;
	private static WebElement element = null;
	public static WebElement date_selection(WebDriver driver)
	{
		
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/div[@id='workAllotmentuserWindow_dtDate_Container']/div/img")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    return element;
	}
	public static WebElement month_selection(WebDriver driver)
	{
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]")).click();
	    driver.findElement(By.xpath("//td[@class='x-date-mp-month']/a[contains(text(),'Apr')]")).click();
		driver.findElement(By.xpath("//td[@class='x-date-mp-year']/a[contains(text(),'2014')]")).click();
		return element;
	}
	public static WebElement ok_button(WebDriver driver)
	{
		//driver.findElement(By.xpath("//td/button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//td[@colspan='4']/button[@class='x-date-mp-ok']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();
		return element;
	}
	public static WebElement Work_start_date(WebDriver driver)
	{
		
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkStartedDate_Container']/div/img")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return element;
	}
	public static WebElement work_completion_date(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div[@id='workAllotmentuserWindow_dtWorkCompletionDate_Container']/div/img")).click();

		return element;
	}
	public static WebElement ok_button1(WebDriver driver)
	{
		//driver.findElement(By.xpath("//td/button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//td[@colspan='4']/button[@class='x-date-mp-ok']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
		return element;
	}
	public static WebElement today(WebDriver driver)
	{
		//driver.findElement(By.xpath("//table/tbody/tr/td[2]/em/button[@class='x-btn-text']")).click();
		//driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[@class='x-btn-text']")).click();
		driver.findElement(By.xpath("//button[@id='ext-gen433']")).click();
		//driver.findElement(By.xpath("//html/body/form/div[11]/ul/li/div/table/tbody/tr[3]/td/table/tbody/tr/td[2]/em/button")).click();
		return element;
	}
	public static WebElement fromdate(WebDriver driver)
	{
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/img")).click();
		//driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'November 2014')]")).click();

		return element;
	}
	
	
}
