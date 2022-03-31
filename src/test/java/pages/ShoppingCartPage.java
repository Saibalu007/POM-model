package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class ShoppingCartPage extends BasePage {

	// private final By scroll =
	// By.xpath("//th[@class='mark']//strong[contains(text(),'Bestellsumme inkl.
	// MwSt.')]");
	private final By scrollOne = By.xpath("//th[@class='mark']//strong[contains(text(),'Bestellsumme inkl.')]");
	private final By checkoutBtn = By.xpath("//a[@class='chekout-button']");
	private final By load = By.xpath("//ul[@class='items']");

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// get Title
	public String getTitle() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(load));
		return driver.getTitle();

	}

	public ShoppingCartPage scroll() {

		WebElement element = driver.findElement(scrollOne);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(scrollOne));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		return this;

	}

	public CheckOutPage clickCheckOutBtn() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(checkoutBtn);
		// wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
		// element.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		return new CheckOutPage(driver);
	}
}
