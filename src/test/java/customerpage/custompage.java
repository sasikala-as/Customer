package customerpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class custompage{
	
	@FindBy(xpath="//*[@id ='usernameOrEmail']")
    public static WebElement username;
    
    @FindBy(id="password")
    public static WebElement password;
    
    @FindBy(xpath= "//button[@type]")
    public static WebElement login;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div/div[6]/div/button/span")
	public static WebElement addcustomer;
	

}
