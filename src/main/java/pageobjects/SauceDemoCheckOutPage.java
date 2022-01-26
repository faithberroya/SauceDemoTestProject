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


public class SauceDemoCheckOutPage extends PageBase {
	
	public static class checkOutPage {
		// user information
		private static TextBox firstNameCheckout = new TextBox("firstName", By.xpath("//input[@id='first-name']"));
		private static TextBox lastNameCheckout = new TextBox("lastName", By.xpath("//input[@id='last-name']"));
		private static TextBox zipCodeCheckout = new TextBox("zipCode", By.xpath("//input[@id='postal-code']"));
		
		// common
		private static Button cancel = new Button("cancel", By.xpath("//button[@id='cancel']"));
		private static Button continueButton = new Button("continueButton", By.xpath("//input[@id='continue']"));
		
		
		public static void inputUserData(TestDataHandler testDataHandler) {
			firstNameCheckout.type(testDataHandler.firstName);
			lastNameCheckout.type(testDataHandler.lastName);
			zipCodeCheckout.type(testDataHandler.zipCode);	
		}
		
		public static void clickContinue() {
			ReportLog.setTestStep("Click continue");
			continueButton.click();
			WebControl.waitForPageToLoad(60);
		}
		
		public static void clickCancel() {
			ReportLog.setTestStep("Click Cancel");
			cancel.click();
			WebControl.waitForPageToLoad(60);
		}		
		
		
		
	}
}
