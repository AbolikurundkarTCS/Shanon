package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setsize2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Dimension p=new Dimension(100,200);
		driver.manage().window().setSize(p);//set size
		Point act=new Point(200, 300);
		driver.manage().window().setPosition(act);//set position
		driver.close();
		
		
	}

}
