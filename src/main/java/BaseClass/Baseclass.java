package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;

	public void driverLaunch(String URL) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Nykaa\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();

	}

}
