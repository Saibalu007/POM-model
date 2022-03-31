package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;
import pages.HomePage;
import pages.StorePage;

public class NavigationTest extends BaseTest {

	@Test
	public void NavigateFromHomeToProductPage() throws InterruptedException {

		HomePage hs = new HomePage(driver);

		// StorePage sp = hs.redirectionMessage().shopIcon();
		StorePage sp = hs.load().shopIcon();

		System.out.println("title = " + sp.getTitle());
		Assert.assertEquals(sp.getTitle(), "Designs | Fill me");
		

	}
}
