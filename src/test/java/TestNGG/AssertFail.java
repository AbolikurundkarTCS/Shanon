package TestNGG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	@Test
	public void tc1() {
		Reporter.log("running tc1,true");
		Assert.fail();//intenitally tc1 is fail
		System.out.println("i am after tc 1 is failed");//verification1
	}
	@Test
	public void tc2() {
		Reporter.log("running tc2,true");//verification 2
}
}