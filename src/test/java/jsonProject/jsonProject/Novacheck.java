package jsonProject.jsonProject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Novacheck {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		for (int i = 1; i <= 8; i++) {
			System.out.println("Started" + i);
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver", "C:\\Program
			// Files\\newchrom\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://preprod.novoshoes.co.nz/");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.findElement(By.id("search-open")).click();
			WebElement element = driver.findElement(By.xpath("//*[@id=\"search\"]"));
			element.sendKeys("iasi");
			element.submit();

			driver.findElement(
					By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div[2]/ol/li/div/div[1]/a/span/span/img"))
					.click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@href='https://preprod.novoshoes.co.nz/iasi-black.html']//img")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//div[@id='option-label-rd_size-151-item-6']")).click();
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
			Thread.sleep(6000);
// driver.findElement(By.id("search-open")).click();
// WebElement element1=driver.findElement(By.xpath("//*[@id=\"search\"]"));
//element1.sendKeys("eolie");
//element1.submit();
// driver.findElement(By.xpath("//*[@id=\"amasty-shopby-product-list\"]/div[2]/ol/li/div/div[1]/a/span/span/img")).click();
// Thread.sleep(9000);
//driver.findElement(By.xpath("//div[@id='option-label-rd_colour-150-item-2073']")).click();
// Thread.sleep(9000);
//driver.findElement(By.xpath("//*[@id=\"option-label-rd_size-151-item-7\"]")).click();
//Thread.sleep(9000);
// driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
// Thread.sleep(15000);
// driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[3]/div[3]/div/a")).click();

			driver.findElement(By.id("customer-email")).sendKeys("thaslim+1@terrificminds.com");
			driver.findElement(By.name("firstname")).sendKeys("sudhin");
			driver.findElement(By.name("lastname")).sendKeys("test123");
			driver.findElement(By.name("street[0]")).sendKeys("streeet address ");
			driver.findElement(By.name("street[1]")).sendKeys("street address");
			driver.findElement(By.name("city")).sendKeys("test city");
			driver.findElement(By.name("postcode")).sendKeys("ab12 3cd");
			Thread.sleep(7000);
			driver.findElement(By.name("telephone")).sendKeys("9947588818");
//WebElement textbox = driver.findElement(By.name("telephone"));
//textbox.sendKeys("9947588818");

			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/div/input"))
					.click();
//driver.findElement(By.xpath("//input[@name='ko_unique_4']")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container-custom\"]/div/button")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"paypal_express\"]")).click();
			Thread.sleep(10000);

			WebElement scroll = driver.findElement(By
					.xpath("//div[@class='payment-method-title field choice']//span[contains(text(),'Credit Card')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", scroll);

			WebElement frame = driver.findElement(By.xpath("//iframe[@class='component-frame visible']"));
			driver.switchTo().frame(frame);

			Thread.sleep(2000);

			String parentHandle = driver.getWindowHandle();
			System.out.println("parent window" + parentHandle);

			driver.findElement(By.xpath("//div[@class='paypal-button-label-container']")).click();
			Thread.sleep(2000);

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Set<String> handle = driver.getWindowHandles();

			for (String handleOne : handle) {
				driver.switchTo().window(handleOne);

				if (!handle.equals(parentHandle)) {

					driver.switchTo().window(handleOne);
					driver.manage().window().maximize();
					System.out.println("switched");
					Thread.sleep(10000);

					driver.findElement(By.xpath("//div[@class='profileRememberedEmail   cookiedProfile']")).clear();
					driver.findElement(By.xpath("//div[@class='profileRememberedEmail   cookiedProfile']"))
							.sendKeys("sb-ky3nt1144907@personal.example.com");
					Thread.sleep(4000);
					driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gn%2M5cG");
					driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
				}

			}

			System.out.println("switched");
			// driver.manage().window().maximize();

			// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(20000);
			System.out.println("check");
			/*
			 * WebElement user = driver.findElement(By.
			 * xpath("//div[@class='profileRememberedEmail   cookiedProfile']"));
			 * 
			 * WebDriverWait wait = new WebDriverWait(driver, 30);
			 * 
			 * wait.until(ExpectedConditions .visibilityOfElementLocated(By.
			 * xpath("//div[@class='profileRememberedEmail   cookiedProfile']")));
			 * user.clear();
			 */

			/*
			 * user.sendKeys("sb-ky3nt1144907@personal.example.com"); Thread.sleep(15000);
			 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gn%2M5cG");
			 * Thread.sleep(9000);
			 */
			// driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//driver.findelement(by.xpath("/html/body/div[1]/section[2]/section/form/div/div[2]/div/input[1]")).sendkeys("thaslim+1@terrificminds.com");
//Thread.sleep(9000);
//driver.findElement(By.xpath("/html/body/div[1]/section[2]/section/form/div/div[3]/div/button/span/core.application.main.directive.content")).click();
//Thread.sleep(8000);
//driver.findElement(By.xpath("/html/body/div[1]/section[2]/section/form/div[3]/div/div/input")).sendKeys("Admin@123");
//Thread.sleep(6000);
//driver.findElement(By.xpath("/html/body/div[1]/section[2]/section/form/div[4]/div/button/span/core.application.main.directive.content")).click();
//Thread.sleep(6000);
//driver.findElement(By.xpath("//*[@id=\"schedule-modal\"]/div[3]/button")).click();
//Thread.sleep(6000);
//driver.findElement(By.xpath("/html/body/div[1]/section[2]/section[1]/form/div/div/section/div/div/div/label/span[1]")).click();
//Thread.sleep(6000);
//driver.findElement(By.xpath("/html/body/div[1]/section[2]/section[1]/form/div/div/div[2]/div/button/span")).click();
//driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div/div/a/span")).click();
//driver.close();
		}
	}
}
