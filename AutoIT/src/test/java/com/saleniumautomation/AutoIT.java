package com.saleniumautomation;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) throws IOException {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VINAYAK/Desktop/fileupload.html");
		driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
		//Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\VINAYAK\\Desktop\\AutoIT\\fileupload.exe");
		
	}
}

