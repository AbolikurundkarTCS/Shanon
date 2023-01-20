package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermethod {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com//");//url
		String link= driver.getTitle();
		System.out.println(link);//title
		Thread.sleep(3000);
		driver.manage().window().maximize();//maximize
		Thread.sleep(1000);
		driver.manage().window().minimize();//minimize
		driver.getCurrentUrl();
		driver.close();
		
		
	}

}