package tests;

import java.io.IOException;
import org.testng.annotations.Test;

import base.BaseTest;
import objects.BillingAddress;
import pages.CheckOutPage;
import pages.HomePage;
import pages.ShoppingCartPage;
import pages.StorePage;
import utils.JacksonUtilis;

public class StorePageTest extends BaseTest {

	@Test
	public void runStore() throws InterruptedException, IOException {
		// StorePage sp = new StorePage(driver);
		HomePage hs = new HomePage(driver);
		// hs.shopIcon().clickProduct();
		StorePage sp = hs.shopIcon();
		// sp.scrollProduct().clickProduct().scrollUp().clickCartButton();

		ShoppingCartPage scp = sp.scrollProduct().clickProduct().scrollUp().clickCartButton();

		// scp.scroll().clickCheckOutBtn();

		// by billingadress class
		CheckOutPage cp = scp.scroll().clickCheckOutBtn();

		BillingAddress billingaddress = JacksonUtilis.deserializeJson("MyBillingAddress.json", BillingAddress.class);

		// BillingAddress billingaddress = new BillingAddress();

		// billingaddress.setMailId("saibalu@gmail.com").setCompanyName("abc").setFirstName("sai").setLastName("balu")
		// .setVatNo("1233").setStreetName("skm").setCityName("tvm").setPostalCode("2323").setPhoneNum("12312312");

		// CheckOutPage cp = scp.scroll().clickCheckOutBtn();

		// by billingadress class
		cp.setBillingAddress(billingaddress).Country().checkOutFinalBtn();

		// by passing values into objects
//		cp.mailId("saibau@gmail.com").companyName("abc").firtName("sai").lastName("balu").vat("12213").streetName("skm")
//				.Country().cityName("tvm").postNum("11").phoneNum("11231").checkOutFinalBtn();

		/*
		 * sp.scrollProduct(); sp.clickProduct(); sp.scrollUp(); sp.clickCartButton();
		 */

		// sp.clickProduct();
	}
}
