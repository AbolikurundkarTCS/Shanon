package TestNGG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserteual {
@Test
public void m1() {
	Reporter.log("running m1()",true);
	String expT="hi";
			String actT="hi";
			Assert.assertEquals(expT, actT);
	
}
}
