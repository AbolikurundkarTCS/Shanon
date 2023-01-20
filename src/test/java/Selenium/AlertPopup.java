package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AlertPopup {
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//enter customer id 
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	//click on submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert alt = driver.switchTo().alert();
	//alt.accept();
	//alt.dismiss();
	String text = alt.getText();
	System.out.println(text);
}

}
