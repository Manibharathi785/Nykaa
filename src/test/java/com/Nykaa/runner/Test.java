package com.Nykaa.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Test {

	@BeforeTest
	void browserLaunch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
	}

}
