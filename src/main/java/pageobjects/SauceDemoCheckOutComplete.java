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


public class SauceDemoCheckOutComplete extends PageBase {
	
	public static class checkOutPage {
		private static Button backHome = new Button("backHome", By.xpath("//button[@id='back-to-products']"));
		
		public static void backHomeButton() {
			ReportLog.setTestStep("Click Home button");
			backHome.click();
		}
		
		
	}
}
