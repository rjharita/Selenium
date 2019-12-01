package PageobjectsEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageobjectTestcases.LoginpageTestcases;

public class LoginpageFactory extends LoginpageTestcases {
		
	public LoginpageFactory(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
}
