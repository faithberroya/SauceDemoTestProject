package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.CheckBox;
import auto.framework.web.Element;
import auto.framework.web.Link;
import auto.framework.web.ListBox;
import auto.framework.web.Page;
import auto.framework.web.RadioButton;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler;


public class SauceDemoCartPage extends PageBase {
	
	public static class cartPage{		
		// commons
		private static Button continueShopping = new Button("continueShopping", By.xpath("//button[@id='continue-shopping']"));
		private static Button checkout = new Button("checkout", By.xpath("//button[@id='checkout']"));
		
		public static void clickContinueShopping() {
			ReportLog.setTestStep("Click Continue Shopping");
			continueShopping.click();
			WebControl.waitForPageToLoad(60);
		}		
		
		public static void clickCheckout() {
			ReportLog.setTestStep("Proceed to Checkout");
			checkout.click();
			WebControl.waitForPageToLoad(60);
		}
		
		
		
		
	}
}
