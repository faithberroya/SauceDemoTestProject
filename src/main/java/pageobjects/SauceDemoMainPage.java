package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Element;
import auto.framework.web.Link;
import auto.framework.web.ListBox;
import auto.framework.web.Page;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler;


public class SauceDemoMainPage extends PageBase {

	public static Page page = new Page("Swag Labs Sauce Demo", "https://www.saucedemo.com/");
	
	TestDataHandler testDataHandler = new TestDataHandler();
	
	public static class LoginSection {
		private static TextBox username = new TextBox("Username", By.xpath("//input[@id='user-name']"));
		private static TextBox password = new TextBox("Password", By.xpath("//input[@id='password']"));
		private static Button login = new Button("Sign in", By.xpath("//input[@id='login-button']"));
		
		public static void login(TestDataHandler testDataHandler) {
			username.type(testDataHandler.username);
			password.type(testDataHandler.password);
			login.click();
			
		}
	}
}