package customerbase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverbase {

			
			public static WebDriver driver;
			public static Properties prop = new Properties();
			public static Properties loc = new Properties();
			public static FileReader fr;
			public static FileReader fr1;

			@BeforeSuite
			public  void setup() throws IOException {
				
				if (driver == null) {
					 fr = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\configfiles\\config.properties");
					 fr1 = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\configfiles\\locators.properties");
					 
					 prop.load(fr);
					 loc.load(fr1);
				    
				}
				System.out.print("========>"+prop.getProperty("browser"));
				if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup(); // base
					 driver = new ChromeDriver(); // base
					driver.get(prop.getProperty("testurl")); // properties	
					
				}
				else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup(); // base
					 driver = new FirefoxDriver(); 
					driver.get(prop.getProperty("testurl")); // properties	
				}
			
			}
			
			@AfterSuite
			public void tearDown() {
				//driver.close();
				System.out.println("Teardown successful");
			}

 }