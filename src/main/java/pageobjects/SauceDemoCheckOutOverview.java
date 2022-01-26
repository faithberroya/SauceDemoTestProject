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


public class SauceDemoCheckOutOverview extends PageBase {
	
	public static class checkOutOverviewPage {
		private static Button finishButton = new Button("finishButton", By.xpath("//button[@id='finish']"));
		
		
		public static void finishButton() {
			ReportLog.setTestStep("Click finish");
			finishButton.click();
		}
		
		
	}
}
