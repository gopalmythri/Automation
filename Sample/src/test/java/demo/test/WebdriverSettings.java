package demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "E://selelnium//chromedriver.exe");
		WebDriver _driver = new ChromeDriver();
		return _driver;
	}
}
