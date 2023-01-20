package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get {
	public static void main(String[] args) throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");//url
		String act=driver.getTitle();
		System.out.println(act);//get title 
		Thread.sleep(1000);
	//	driver.manage().window().maximize();//maximize
		//Thread.sleep(3000);
		//driver.close();//close
		Thread.sleep(3000);
		//driver.manage().window().minimize();//minimize
		String link=driver.getCurrentUrl();
		System.out.println(link);//get url
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.close();//close
		
		
		
		
		
		
		
		
		
		
	}
	

}
