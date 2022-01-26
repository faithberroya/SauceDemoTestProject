package scenarios;



import org.testng.annotations.Test;

import auto.framework.ReportLog;
import auto.framework.TestBase;
import auto.framework.web.WebControl;
import common.TestDataHandler;
import pageobjects.SauceDemoCollatedWebElements;
import pageobjects.SauceDemoCollatedWebElements.checkOutPage;
import pageobjects.SauceDemoCollatedWebElements.itemPage;
import pageobjects.SauceDemoCollatedWebElements.LoginSection;
import pageobjects.SauceDemoCollatedWebElements.burgerMenu;
import pageobjects.SauceDemoCollatedWebElements.itempagecommons;
import pageobjects.SauceDemoCollatedWebElements.footers;
import pageobjects.SauceDemoCollatedWebElements.cartPage;
import pageobjects.SauceDemoCollatedWebElements.checkOutOverviewPage;
import pageobjects.SauceDemoCollatedWebElements.checkOutLastPage;

public class SauceDemo_OrderBikeLightBoltTShirtAllTheThings extends TestBase {
	
	@Test
	public void testScenario() throws Exception   {
		
		TestDataHandler testDataHandler = new TestDataHandler();
		ReportLog.setTestName("SauceDemo - Order Items");
		ReportLog.setTestCase("Verify user can order Bike Light, Bolt T Shirt and All The Things T Shirt");
		
		itemPage.addToCartBikeLight();
		itemPage.addToCartBoltTShirt();
		itemPage.addToCartAllTheThings();
		itempagecommons.clickCart();
		cartPage.clickCheckout();
		checkOutPage.inputUserData(testDataHandler);
		checkOutPage.clickContinue();
		checkOutOverviewPage.finishButton();
		checkOutLastPage.backHomeButton();
		
		
		
		
	}
}
