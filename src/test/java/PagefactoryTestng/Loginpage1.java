package PagefactoryTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//DIV[TEXT()='Login']")private WebElement LoginBTN;
	//initialization
	public Loginpage1(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);	
	}
	public void clickLoginBtn() {
		LoginBTN.click();
	}
	
}
