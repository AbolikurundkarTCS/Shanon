package PagefactoryTestng;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	org.apache.poi.ss.usermodel.Sheet sh;
	WebDriver driver;
	Loginpage1 l;
	Homepage1 h;
	
	@BeforeClass
	public void openBrowser()throws Throwable{
		FileInputStream fis=new FileInputStream("\"C:\\Users\\Admin\\OneDrive\\Desktop\\sheet 1.xlsx\"");
		sh= WorkbookFactory.create(fis).getSheet("sheet 1");
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://demo.actitime.com/login.do");//all object we need to create
		 l=new Loginpage1(driver);
		h=new Homepage1(driver);
	}
		@ BeforeMethod
		public void openApp() {
			String username = sh.getRow(0).getCell(0).getStringCellValue();
			l.enterUN(username);
			String password = sh.getRow(0).getCell(1).getStringCellValue();
			l.enterPWD(password);
			l.clickLoginBtn();
		}
		@Test
		public void verifyText() {
			Reporter.log("Running VerifyText",true);
			String expText = sh.getRow(0).getCell(1).getStringCellValue();
			String actText = h.verifyText();
		  Assert.assertEquals(expText,actText);
		}
		@AfterMethod
		public void logout() {
			Reporter.log("logout from app",true);
		}
		@AfterClass
		public void closeBrowser() {
			Reporter.log("close the browser",true);
		}
			
	
	
		
	
		
	

	
		
	}
	
	


