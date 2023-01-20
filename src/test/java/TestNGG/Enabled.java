package TestNGG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void tc1() {
		Reporter.log("i ts my first program in testng",true);
	}
@Test(enabled=false)
public void tc2() {
	Reporter.log("i ts my second program in testng",true);
	
}
}
