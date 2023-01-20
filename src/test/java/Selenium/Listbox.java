package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox {
	
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(3000);
	WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
	Thread.sleep(3000);
	Select s=new Select(Day);
	s.selectByValue("6");
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(3000);
	Select p=new Select(month);
	p.selectByVisibleText("Dec");
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select e=new Select(year);
	e.selectByValue("1996");

	
	
}

}
