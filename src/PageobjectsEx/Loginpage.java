package PageobjectsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageobjectTestcases.LoginpageTestcases;

public class Loginpage extends LoginpageTestcases{

	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By username = By.id("login1");
	
	By password = By.id("password");
	
	public WebElement username() {
		
		return driver.findElement(username);
	}
	
public WebElement passwordval() {
		
		return driver.findElement(password);
	}
	
}
