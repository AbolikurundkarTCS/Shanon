package TestNGG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {
	@Parameters("browsername")
	@Test
	public void TC(String browsername) {
		WebDriver driver =null;
		if(browsername.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
		}
			else if
			(browsername.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				
				}
		driver.get("https://www.amazon.in/");
		
	}
	
}
