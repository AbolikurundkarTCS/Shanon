package TestNGG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser",true);
	}
@BeforeMethod
public void logintoapp() {
	Reporter.log("login to app",true);
}
@Test
public void verifyText() {
	Reporter.log("Running actual test cases",true);
	
	
}
@AfterMethod
public void logoutAPP() {
	Reporter.log("Logout from app",true);
	
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close browser",true);
} 


}
