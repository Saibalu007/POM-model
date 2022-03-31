package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import objects.BillingAddress;
import pages.CheckOutPage;
import pages.ShoppingCartPage;
import pages.StorePage;
import utils.JacksonUtils;

public class StoreToCheckOutTest extends BaseTest {

	@Test
	public void storeToCart() throws InterruptedException, IOException {

		StorePage sp = new StorePage(driver);

		ShoppingCartPage scp = sp.load().scrollProduct().clickProduct().scrollUp().clickCartButton();
		// System.out.println("title = " + scp.getTitle());
		Assert.assertEquals(scp.getTitle(), "Warenkorb | Fill me");

		CheckOutPage cp = scp.scroll().clickCheckOutBtn();

		Assert.assertEquals(cp.getTitle(), "Kasse");

		BillingAddress billingaddress = JacksonUtils.deserializeJson("MyBillingAddress.json", BillingAddress.class);

		cp.setBillingAddress(billingaddress).Country().checkOutFinalBtn();
	}
}
