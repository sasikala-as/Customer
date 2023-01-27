package customertest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import customerbase.driverbase;
import customerpage.custompage;

public class customerbuttontest extends driverbase {

	@Test

	public void Customerbutton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("mastercard"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("customerbar"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("customersitebutton"))).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(loc.getProperty("addcustomer"))).click();

	
        SoftAssert aa = new SoftAssert();
        Point actual = custompage.addcustomer.getLocation();
        
        int x = actual.getX();
        System.out.println(x);
        
    
      /*  String expactedresult = "rgb(0, 19, 40)";
        
        
	  //Background color change
	String expacted = "rgb(0, 19, 40)";
	WebElement addcustomer = driver.findElement(By.xpath(loc.getProperty("addcustomer")));
	String btncolor = addcustomer.getCssValue("background");
	 
	 System.out.println(btncolor);
	 
	 String hexColor = Color.fromString(btncolor).asHex();
	 
	 String actual = hexColor;
	 
	 Assert.assertEquals(actual,expacted);
	 
	/* 
	  
	  //Font Size
	  
	  String fwidth = driver.findElement(By.xpath(
	  "//button[@ant-click-animating-without-extra-node='false']")).getCssValue(
	  "width");
	  
	  System.out.println("FontWidth: "+fwidth);
	  
	  
	  // font color
	  
	  String color = driver.findElement(By.xpath(
	  "//button[@ant-click-animating-without-extra-node='false']")).getCssValue(
	  "color");
	  
	  System.out.println("color: "+color);
	  
	  // background color
	  
	  String background = driver.findElement(By.xpath(
	  "//button[@ant-click-animating-without-extra-node='false']")).getCssValue(
	  "background");
	  
	  System.out.println("background: "+background);
	  
	  */
	  driver.close();
	 

}
}
