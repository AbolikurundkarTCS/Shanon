package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicElement {


public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/coronavirus/");
	//print corona virus cases
	String cvc = driver.findElement(By.xpath("//div[@class='maincounter-number']//span[1]")).getText();
	System.out.println(cvc);
	//print death cases
	String death = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	System.out.println(death);
	
	
	
}
}
