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

public class SauceDemo_Login extends TestBase {
	
	@Test
	public void testScenario() throws Exception   {
		
		TestDataHandler testDataHandler = TestDataHandler.loadTestData("SauceDemo", "RowSelection='SauceDemo_Login'");
		
		ReportLog.setTestName("SauceDemo - Sign In");
		ReportLog.setTestCase("Verify user can sign In to Swag Labs");
		
		ReportLog.setTestStep("Navigate to Swag Labs");	
		WebControl.open(testDataHandler.url);
		WebControl.waitForPageToLoad(60);
		
		LoginSection.login(testDataHandler);
	}
}
