package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import objects.BillingAddress;
import pages.CheckOutPage;
import pages.HomePage;
import pages.ShoppingCartPage;
import pages.StorePage;
import utils.JacksonUtils;

import java.io.IOException;

public class OrderFlowTest extends BaseTest {

	@Test
	public void runStore() throws InterruptedException, IOException {

		HomePage hs = new HomePage(driver);

		// StorePage sp = hs.redirectionMessage().shopIcon();
		StorePage sp = hs.load().shopIcon();

		ShoppingCartPage scp = sp.scrollProduct().clickProduct().scrollUp().clickCartButton();

		// by billingadress class

		CheckOutPage cp = scp.scroll().clickCheckOutBtn();

		Thread.sleep(3000);

		cp.getTitle();

		BillingAddress billingaddress = JacksonUtils.deserializeJson("MyBillingAddress.json", BillingAddress.class);
		// System.out.println(billingaddress);
		cp.setBillingAddress(billingaddress).Country().checkOutFinalBtn();

	}
}
