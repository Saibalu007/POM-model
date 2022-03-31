package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class HomePage extends BasePage {

	// By pageFactory Method

	/*
	 * @FindBy(xpath = "//div[@class='shop-block']") private WebElement shopIcon;
	 * 
	 * 
	 * By using CacheLookup
	 * 
	 * @FindBy(xpath = "//div[@class='shop-block']")
	 * 
	 * @CacheLookup private WebElement shopIcon;
	 */

	private final By redirectionBox = By.xpath("(//div[@class='modal-inner-wrap'])[2]");
	private final By okBtn = By.xpath("(//button[@type='button']//span[contains(text(),'OK')])[3]");
	private final By shopIcon = By.xpath("//div[@class='shop-block']");

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	// to load URL
	public HomePage load() {
		load("/");
		return this;
	}

	public HomePage redirectionMessage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(redirectionBox));
		driver.findElement(okBtn).click();
		Thread.sleep(3000);
		return this;
	}

	public StorePage shopIcon() throws InterruptedException {

		// By PageFactory method
		// shopIcon.click();

		driver.findElement(shopIcon).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new StorePage(driver);

	}

}
