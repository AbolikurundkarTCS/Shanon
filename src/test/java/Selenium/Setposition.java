package Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Setposition {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Point p=new Point(300,400);
	
	
driver.manage().window().setPosition(p);
driver.close();

	
}
}
