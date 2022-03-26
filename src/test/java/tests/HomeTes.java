package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomeTes extends BaseTest {

	@Test
	public void run() throws InterruptedException {
		HomePage hs = new HomePage(driver);

		hs.shopIcon();
	}
}
