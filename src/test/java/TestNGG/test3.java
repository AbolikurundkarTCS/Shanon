package TestNGG;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
	
	@Test
	public void TC3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Welcome to Amazon", true);
	Assert.fail();
		
		
	}
	@Test
	public void TC4() {
		Reporter.log("I am good", false);
	}
@Test
public void TC5() {
	Reporter.log("I am ok", false);
	Assert.fail();
}
}
