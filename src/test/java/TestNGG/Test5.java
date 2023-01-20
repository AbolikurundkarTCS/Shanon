package TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {
	@Test
	public void TC9() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Welcome to flipkart", true);
		Assert.fail();
		
	}
	@Test
	public void TC10() {
		Reporter.log("Shopping destination ",true);
		Assert.fail();
	}
@Test
public void TC11() {
	Reporter.log("Enter your details", false);
	Assert.fail();
}
}






