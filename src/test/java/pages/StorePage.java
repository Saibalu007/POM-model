package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BasePage;

public class StorePage extends BasePage {

	private final By scroll = By.xpath("//h1[contains(text(),'FILL ME RAKETE 0.6L')]");
	private final By product = By.xpath("(//button[@type='submit'][@class='action tocart primary'])[2]");
	private final By headScroll = By.tagName("header");
	private final By cartBtn = By.xpath("//div[@class='minicart-wrapper']");

	public StorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public StorePage scrollProduct() {
		WebElement element = driver.findElement(scroll);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		return this;

	}

	// fluent interface
	public StorePage clickProduct() throws InterruptedException {

		driver.findElement(product).click();
		Thread.sleep(2000);
		return this;

		// return new ProductPage(driver);
	}

	public StorePage scrollUp() {
		WebElement element = driver.findElement(headScroll);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		return this;

	}

	public ShoppingCartPage clickCartButton() {

		driver.findElement(cartBtn).click();

		return new ShoppingCartPage(driver);
	}

	
}
