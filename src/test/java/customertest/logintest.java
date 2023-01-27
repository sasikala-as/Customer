package customertest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import customerbase.driverbase;

public class logintest extends driverbase {
	
@Test
	public void LoginTest(){
		
//		
//		WebDriverManager.chromedriver().setup(); // base
//		WebDriver driver = new ChromeDriver(); // base
//	    driver.get("http://qdms-phase-3.s3-website.ap-south-1.amazonaws.com/#/"); // properties		
		
		System.out.println("Clicked Successfully");
		driver.findElement(By.id(loc.getProperty("login_emailfield"))).sendKeys("admin");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("tokyo@admin");
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
		System.out.println("Tokyo System Successfully Login");
		
				
		
		}
		
}