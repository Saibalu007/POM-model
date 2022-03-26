package jsonProject.jsonProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DD {

	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tm:1234@dev-woodblocx.terrificminds.com:8090/");

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	@Test(dataProvider = "dp")
	public void login(String data) {

		String users[] = data.split(",");

		driver.findElement(By.xpath("(//li[@class='link authorization-link']//a[contains(text(),'Sign In')])[1]"))
				.click();

		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(users[0]);
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(users[1]);
		driver.findElement(By.xpath("(//button[@type='submit'][@name='send'])[1]")).click();

	}

	@DataProvider(name = "dp")
	public String[] readJson() throws IOException, ParseException {

		JSONParser jp = new JSONParser();
		FileReader reader = new FileReader(".\\jsonFiles\\TestData.json");

		Object obj = jp.parse(reader);
		JSONObject userData = (JSONObject) obj;
		// JsonArray userLoginArray = (JsonArray) userData.get("userlogins");
		JSONArray array = (JSONArray) userData.get("userlogins");

		String arr[] = new String[array.size()];

		for (int i = 0; i < array.size(); i++) {
			JSONObject users = (JSONObject) array.get(i);
			String user = (String) users.get("log");
			String pwd = (String) users.get("passLog");

			arr[i] = user + "," + pwd;

		}
		return arr;
	}

}
