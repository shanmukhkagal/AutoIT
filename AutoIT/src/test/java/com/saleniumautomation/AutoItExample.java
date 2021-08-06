package com.saleniumautomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
		   ChromeDriver driver = new ChromeDriver();
           driver.get("https://www.monsterindia.com/seeker/registration");
           driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
           Runtime.getRuntime().exec("D:\\FL.exe");
	}

}
