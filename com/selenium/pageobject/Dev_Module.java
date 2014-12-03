package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dev_Module {
    public static WebElement element=null;
    private static WebDriver driver;
    public static WebElement Development_module(WebDriver driver){
        element= driver.findElement(By.xpath("//div/div/div/span[contains(text(),'Development')]"));
        element.click();
        return element;
}
    public static WebElement Work_creation(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Work Creation')]"));
        element.click();
        return element;
    }
    public static WebElement Work_allocation(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Work Allocation')]"));
        element.click();
        return element;
    }
    public static WebElement Work_progress(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Work Progress')]"));
        element.click();
        return element;
    }
    public static WebElement Manage_contractor(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Manage Contractor')]"));
        element.click();
        return element;
}
    public static WebElement Contractor_bill(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Contractor Bill Preparation')]"));
        element.click();
        return element;
}
    public static WebElement Yard_maintenance(WebDriver driver){
        element= driver.findElement(By.xpath("//a/span[contains(text(),'Yard Maintenance')]"));
        element.click();
        return element;
}
   
}
