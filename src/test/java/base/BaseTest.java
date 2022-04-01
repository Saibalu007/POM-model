package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void startDriver() {

		//intializing driver is been called from DriverManager Class
		driver = new DriverManager().intializeDriver();

	}

	@AfterMethod
	public void quitDriver() {
		driver.quit();

	}
}
