package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Particularscreenshot {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement abc = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src=abc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\17 sept\\google.png");
		Files.copy(src, dest);
		
		
	}

}
