package Selenium;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotscroll {
	public static void main(String[] args) throws AWTException, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);//KEY PRESS
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);//KEY RELEASE
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);//KEY PRESS
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);//KEY RELEASE
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);//KEY PRESS
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);//KEY RELEASE
	}

}
