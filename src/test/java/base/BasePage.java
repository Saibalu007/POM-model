package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigLoader;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
	}

	// Base Url
	public void load(String endPoint) {

		// driver.get("https://tmadmin:vh^%25f53cFvdD(5c@staging-fillme.terrificminds.com/"
		// + endPoint);
		driver.get(ConfigLoader.getInstance().getBaseUrl() + endPoint);
	}

// to wait for the overlays to disappear if occurs
	public void waitForOverlaysToDisappear(By overlay) {
		List<WebElement> overlays = driver.findElements(overlay);
		System.out.println("OVERLAY SIZE" + overlays.size());
		if (overlays.size() > 0) {

			wait.until(ExpectedConditions.invisibilityOfAllElements(overlays));
			System.out.println("OVERLAYS INVISIBLE");
		} else {
			System.out.println("OVERLAY NOT FOUND");
		}

	}

}