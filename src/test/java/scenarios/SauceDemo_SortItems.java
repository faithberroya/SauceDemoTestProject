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

public class SauceDemo_SortItems extends TestBase {
	
	@Test
	public void testScenario() throws Exception   {
		
		TestDataHandler testDataHandler = new TestDataHandler();
		ReportLog.setTestName("SauceDemo - Remove functionality");
		ReportLog.setTestCase("Verify user can sort items");
	
		itempagecommons.sortItemsNameAtoZ();
		itempagecommons.sortItemsNameZtoA();
		itempagecommons.sortItemsPriceLowToHigh();
		itempagecommons.sortItemsPriceHighToLow();
		
	}
}
