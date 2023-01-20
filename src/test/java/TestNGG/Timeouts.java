package TestNGG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test
public void tc1() {
	Reporter.log("i ts my program in testng",true);
}
@Test(timeOut=60000)
public void tc2() {
	Reporter.log("i ts my second program in testng",true);
	Assert.fail();
}
}
