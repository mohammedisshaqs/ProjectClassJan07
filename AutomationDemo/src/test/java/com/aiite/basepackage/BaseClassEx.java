package com.aiite.basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassEx {

 public static WebDriver driver;
 
 public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
 
public static void loadUrl(String url) {
	driver.navigate().to(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
