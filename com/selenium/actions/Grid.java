package com.selenium.actions;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Grid {
	private static final CharSequence ContractorName = null;
	public static WebDriver driver;
	public static WebElement element = null;
	public void getcount() throws InterruptedException{
		String PageCount = driver.findElement(By.xpath("//table/tbody/tr/td[2]/div")).getText();
	    System.out.println(PageCount);
	    PageCount = PageCount.replace("of ", "");
	    Integer PageCount_int = Integer.parseInt(PageCount);

	    Thread.sleep(1000);
	    for(int  i=0; i<PageCount_int;i++){
	        boolean flag = false;
			for (int j=1; j<20;j++){
	            WebElement Grid = driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[" + j + "]/table/tbody/tr/td[2]/div"));
	            String T = Grid.getText();
	            if (T.contains(ContractorName)){

	                Grid.click();
	                System.out.println("Record found at " + i + " Page");
	                flag=true;
	                break;
	        }
	       
	   
	        }
	        if (flag) {
	            break;
	        }

	         else {
	                driver.findElement(By.xpath("//tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text x-tbar-page-next']")).click();

	        }
	    } 
	   
	   

	   
	Object s = null;
	Object s1 = null;
	while(s.equals(s1));

	}	}
