package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;
import objects.BillingAddress;

public class CheckOutPage extends BasePage {

	private final By mailId = By.xpath("(//input[@type='email'])[1]");
	// private final By companyName =
	// By.xpath("(//div[@class='control']//input[@type='text'])[2]");
	private final By firstName = By.xpath("(//div[@class='control']//input[@type='text'])[2]");
	private final By lastName = By.xpath("(//div[@class='control']//input[@type='text'])[3]");
	private final By vatNo = By.xpath("(//div[@class='control']//input[@type='text'])[4]");
	private final By streetName = By.xpath("(//div[@class='control']//input[@type='text'])[5]");
	private final By country = By.xpath("(//select[@class='select'])[1]");
	private final By cityName = By.xpath("(//div[@class='control']//input[@type='text'])[8]");
	private final By postalCode = By.xpath("(//div[@class='control']//input[@type='text'])[9]");
	private final By phoneNum = By.xpath("(//div[@class='control _with-tooltip']//input[@type='text'])[1]");
	private final By scrolling = By
			.xpath("(//div[@class='osc-place-order-block checkout-addition-block col-mp mp-12'])[1]");
	private final By checkout = By.xpath("(//button[@class='action primary checkout'])[2]");

	private final By load = By.xpath("//div[@class='checkout-title']");

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(load));
		return driver.findElement(load).getText();
		// System.out.println(driver.findElement(checkOutAssert).getText());

	}

	public CheckOutPage mailId(String mail) {

		driver.findElement(mailId).sendKeys(mail);
		return this;
	}

	/*
	 * public CheckOutPage companyName(String companynName) {
	 * 
	 * driver.findElement(companyName).sendKeys(companynName); return this; }
	 */

	public CheckOutPage firtName(String name) {

		driver.findElement(firstName).sendKeys(name);
		return this;
	}

	public CheckOutPage lastName(String name) {

		driver.findElement(lastName).sendKeys(name);
		return this;
	}

	public CheckOutPage vat(String vat) {

		driver.findElement(vatNo).sendKeys(vat);
		return this;
	}

	public CheckOutPage streetName(String name) {

		driver.findElement(streetName).sendKeys(name);
		return this;
	}

	public CheckOutPage Country() {

		WebElement element = driver.findElement(lastName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		Select drop = new Select(driver.findElement(country));

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drop.selectByVisibleText("Liechtenstein");
		// drop.selectByIndex(0);
		return this;
	}

	public CheckOutPage cityName(String name) {

		driver.findElement(cityName).sendKeys(name);
		return this;

	}

	public CheckOutPage postNum(String code) {

		driver.findElement(postalCode).sendKeys(code);
		return this;

	}

	public CheckOutPage phoneNum(String num) {

		driver.findElement(phoneNum).sendKeys(num);
		return this;

	}

	public CheckOutPage checkOutFinalBtn() {

		WebElement element = driver.findElement(scrolling);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(checkout).click();
		return this;

	}

	public CheckOutPage setBillingAddress(BillingAddress billingAdress) {

		return mailId(billingAdress.getMailId()).firtName(billingAdress.getFirstName())
				.lastName(billingAdress.getLastName()).vat(billingAdress.getVatNo())
				.streetName(billingAdress.getStreetName()).cityName(billingAdress.getCityName())
				.postNum(billingAdress.getPostalCode()).phoneNum(billingAdress.getPhoneNum());

	}

}
