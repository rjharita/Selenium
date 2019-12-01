package PageobjectTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageobjectsEx.Loginpage;
import PageobjectsEx.LoginpageFactory;

public class LoginpageTestcases {

	public static WebDriver driver;
	
	@Test
	
	public void logintestcase() {
		
		System.setProperty("webdriver.chrome.driver", "./Browerutils/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Loginpage lp = new Loginpage(driver);
		
		/*lp.username().sendKeys("rj@yahoo.com");
		
		lp.passwordval().sendKeys("testpass");*/
		
		LoginpageFactory.username.sendKeys("rj@yahoo.com");
		
		LoginpageFactory.password.sendKeys("testpass");
		
	}
}
