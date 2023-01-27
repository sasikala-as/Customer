package customertest;





import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import customerbase.driverbase;
import customerpage.custompage;


@Test
public class customtest extends driverbase {
	
	custompage custbtn = new custompage();
	
	  
	    public void adminButton() throws InterruptedException, IOException{
	            
	        
	    PageFactory.initElements(driver,custbtn);
	    
	    custompage.username.sendKeys("Admin");
	    custompage.password.sendKeys("tokyo@admin");
	    custompage.login.click();
	  //	    Thread.sleep(2000);
	    
	        
	    Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("mastercard"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("customerbar"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("customersitebutton"))).click();
		Thread.sleep(2000);
	    //adminButton.CheckAdmin.click();

	    
	    
	    SoftAssert aa = new SoftAssert();
	    Point actual = custompage.addcustomer.getLocation();
	    
	    int x = actual.getX();
	    int expectedresult = 970;
	    System.out.println("x-axis = " + x);
	    aa.assertEquals(x, expectedresult);
	    
	    
	    int y = actual.getY();
	    int expectresult =  97;
	    System.out.println("y-axis = " + y);
	    aa.assertEquals(expectresult, y);
	    
	    
	    org.openqa.selenium.Dimension size = custompage.addcustomer.getSize();
	    int width = size.getWidth();
	    System.out.println("width  = " + width);
	    int expectedresult1 =89;
	    aa.assertEquals(width, expectedresult1);    
	     
	    int height = size.getHeight();
	    System.out.println("height = " + height);
	    int expectedresult2 =22;
	    aa.assertEquals(height, expectedresult2);
	    
	    
	    String backgroundColor = custompage.addcustomer.getCssValue("background-color");
	    System.out.println("backgroundclr = " + backgroundColor );
	    String bgc = "rgba(0, 0, 0, 0)";
	    aa.assertEquals(backgroundColor, bgc);
	    
	    
	    
	    
	    String borderColor = custompage.addcustomer.getCssValue("border-color");
	    System.out.println("borderColor = " + borderColor);
	    String bc = "rgb(255, 255, 255)";
	    aa.assertEquals(borderColor, bc);
	    

	    
	    

	    String font = custompage.addcustomer.getCssValue("font-family");
	    System.out.println("Font of button: " + font);
	    String ft = "Roboto, sans-serif";
	    aa.assertEquals(font, ft);
	    
	    
	    
	    String color = custompage.addcustomer.getCssValue("color");
	    System.out.println("Font color of button: " + color);
	    String fontclr = "rgba(255, 255, 255, 1)";
	    aa.assertEquals(fontclr, color);
	    
	    
	     String txt = custompage.addcustomer.getText();
	     System.out.println("text = " + txt);
	     String txxt = "Add Customer";
	     aa.assertEquals(txt, txxt);
	     
	     aa.assertAll();
	    	    
	}
	    
   
	    
	}	
	


