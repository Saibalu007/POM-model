package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class HomePage extends BasePage {

	private final By shopIcon = By.xpath("//div[@class='shop-block']");
	// private final By rectangularIcon =
	// By.xpath("//li//a//span[contains(text(),'Rectangular raised beds')]");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public StorePage shopIcon() throws InterruptedException {

		// driver.get("http://tm:1234@dev-woodblocx.terrificminds.com:8090/");
		// Actions action = new Actions(driver);

		// action.moveToElement(driver.findElement(raisedBedIcon));

		// Thread.sleep(5000);

		driver.findElement(shopIcon).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new StorePage(driver);

	}

}
