package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childbrowserpopup {
	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//click on cancel button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//search any mobile
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);
		Thread.sleep(5000);
		//click on first phone
		

}
}