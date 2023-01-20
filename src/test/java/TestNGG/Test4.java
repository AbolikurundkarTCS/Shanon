package TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	public class test3 {
		
		@Test
		public void TC6() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.actitime.com/");
			Reporter.log("Its a time tracking software", true);
		
			
		}
		@Test
		public void TC7() {
			Reporter.log("Track your time here",true);
			Assert.fail();
		}
	@Test
	public void TC8() {
		Reporter.log("Enter time track", false);
	
	}
	}


}
