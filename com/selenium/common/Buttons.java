package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttons {
	private static WebElement element = null;
	public static WebElement newRecord(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//td/em/button[contains(text(),'New Record')]"));
		element.click();
		return element;
	}
	
	public static WebElement editRecord(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[contains(text(),'Edit Record')]")).click();
		return element;
	}
	public static WebElement deleteRecord(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[contains(text(),'Delete Record')]")).click();
		return element;
	}
	public static WebElement savebutton(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		return element;
	}
	public static WebElement ok_message_button(WebDriver driver)
	{
		driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[contains(text(),'OK')]")).click();
		return element;
	}
	public static WebElement close_buttton(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		return element;
	}
	

}
