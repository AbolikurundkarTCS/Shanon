package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathbycontains {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		
		
		
	}
	

}
