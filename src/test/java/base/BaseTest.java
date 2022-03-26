package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverManager;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void startDriver() {

		driver = new DriverManager().intializeDriver();

		driver.get("https://tmadmin:vh^%25f53cFvdD(5c@staging-fillme.terrificminds.com/");
		// driver.get("http://tm:1234@dev-woodblocx.terrificminds.com:8090/");
	}

	@AfterMethod
	public void quitDriver() {
		// driver.quit();

	}
}
