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


public class SauceDemoCollatedWebElements extends PageBase {
	
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
	
	
	public static class itemPage {
		// link titles
		private static Link sauceLabsBackPackTitle = new Link("SauceLabsBackPack Title", By.xpath("//*[@id=\'item_4_title_link\']/div"));
		private static Link sauceLabsBikeLightTitle = new Link("SauceLabsBikeLight Title", By.xpath("//*[@id=\'item_0_title_link\']/div"));
		private static Link sauceLabsBoltTShirtTitle = new Link("sauceLabsBoltTShirt Title", By.xpath("//*[@id='item_1_title_link']/div"));
		private static Link sauceLabsFleeceJacketTitle = new Link("sauceLabsFleeceJacket Title", By.xpath("//*[@id='item_5_title_link']/div"));
		private static Link sauceLabsFleeceOnesieTitle = new Link("sauceLabsFleeceOnesie Title", By.xpath("//*[@id='item_2_title_link']/div"));
		private static Link sauceLabsAllTheThingsTitle = new Link("sauceLabsAllTheThings Title", By.xpath("//*[@id='item_3_title_link']/div"));
		
		// add to cart buttons
		private static Button addToCartSauceLabsBackPack = new Button("SauceLabsBackPack", By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
		private static Button addToCartSauceLabsBikeLight = new Button("SauceLabsBikeLight", By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']"));
		private static Button addToCartSauceLabsBoltTShirt = new Button("SauceLabsBoltTShirt", By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
		private static Button addToCartSauceLabsFleeceJacket = new Button("addToCartSauceLabsFleeceJacket", By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']"));
		private static Button addToCartSauceLabsOnesie = new Button("addToCartSauceLabsOnesie", By.xpath("//button[@name='add-to-cart-sauce-labs-onesie']"));
		private static Button addToCartSauceLabsAllTheThings = new Button("addToCartSauceLabsAllTheThings", By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		
		// remove buttons
		private static Button removeSauceLabsBackPack = new Button("removeSauceLabsBackPack", By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		private static Button removeSauceLabsBikeLight = new Button("removeSauceLabsBikeLight", By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
		private static Button removeSauceLabsBoltTShirt = new Button("removeSauceLabsBoltTShirt", By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
		private static Button removeSauceLabsfleeceJacket = new Button("removeSauceLabsBoltTShirt", By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']"));
		private static Button removeSauceLabsOnesie = new Button("removeSauceLabsOnesie", By.xpath("//button[@id='remove-sauce-labs-onesie']"));
		private static Button removeSauceLabsAllTheThings = new Button("removeSauceLabsAllTheThings", By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
		
		// common
		private static Button backToProductsButton = new Button("backToProductsButton", By.xpath("//button[@id='back-to-products']"));

		
		public static void addToCartBackPack() {
			ReportLog.setTestStep("View and add to cart backpack");
			sauceLabsBackPackTitle.click();
			addToCartSauceLabsBackPack.click();		
			backToProductsButton.click();
		}
		
		public static void addToCartBikeLight() {
			ReportLog.setTestStep("View and add to cart bike light");
			sauceLabsBikeLightTitle.click();
			addToCartSauceLabsBikeLight.click();	
			backToProductsButton.click();
		}
		
		public static void addToCartBoltTShirt() {
			ReportLog.setTestStep("View and add to cart bolt T-shirt");
			sauceLabsBoltTShirtTitle.click();
			addToCartSauceLabsBoltTShirt.click();	
			backToProductsButton.click();
		}
		
		public static void addToCartFleeceJacket() {
			ReportLog.setTestStep("View and add to cart fleece jacket");
			sauceLabsFleeceJacketTitle.click();
			addToCartSauceLabsFleeceJacket.click();	
			backToProductsButton.click();
		}
		
		public static void addToCartFleeceOnsesie() {
			ReportLog.setTestStep("View and add to cart fleece onsesie");
			sauceLabsFleeceOnesieTitle.click();
			addToCartSauceLabsOnesie.click();	
			backToProductsButton.click();
		}
		
		public static void addToCartAllTheThings() {
			ReportLog.setTestStep("View and add to cart All The Things");
			sauceLabsAllTheThingsTitle.click();
			addToCartSauceLabsAllTheThings.click();		
			backToProductsButton.click();
		}
		
		public static void removeBackPack() {
			ReportLog.setTestStep("Remove backpack from cart");
			removeSauceLabsBackPack.click();
		}
		
		public static void removeBikeLight() {
			ReportLog.setTestStep("Remove bike light from cart");
			removeSauceLabsBikeLight.click();
		}
		
		public static void removeBoltTShirt() {
			ReportLog.setTestStep("Remove bolt t shirt from cart");
			removeSauceLabsBoltTShirt.click();
		}
		
		public static void removefleeceJacket() {
			ReportLog.setTestStep("Remove fleece Jacket from cart");
			removeSauceLabsfleeceJacket.click();
		}
		
		public static void removeOnesie() {
			ReportLog.setTestStep("Remove onesie from cart");
			removeSauceLabsOnesie.click();
		}
		
		public static void removeAllTheThings() {
			ReportLog.setTestStep("Remove all the things t-shirt from cart");
			removeSauceLabsAllTheThings.click();
		}
		
		public static void clickBackToProductsButton() {
			ReportLog.setTestStep("Click back to products");
			backToProductsButton.click();
			WebControl.waitForPageToLoad(60);
		}
	}
		
	
	
	
	public static class burgerMenu {
		// burger menu button
		private static Button burgerMenuButton = new Button("burgerMenuButton", By.xpath("//button[@id='react-burger-menu-btn']"));
		private static Button allItemsButton = new Button("allItemsButton", By.xpath("//a[@id='inventory_sidebar_link']"));
		private static Button aboutButton = new Button("aboutButton", By.xpath("//a[@id='about_sidebar_link']"));
		private static Button logoutButton = new Button("logoutButton", By.xpath("//a[@id='logout_sidebar_link']"));
			
		public static void clickAllItems() {
			ReportLog.setTestStep("Click 'All items' from burger menu");
			burgerMenuButton.click();
			allItemsButton.click();
			WebControl.waitForPageToLoad(60);
		}
		
		public static void clickAbout() {
			ReportLog.setTestStep("Click 'About' from burger menu");
			burgerMenuButton.click();
			aboutButton.click();
			WebControl.waitForPageToLoad(60);
		}
		
		public static void clickLogout() {
			ReportLog.setTestStep("Click 'Logout' from burger menu");
			burgerMenuButton.click();
			logoutButton.click();
			WebControl.waitForPageToLoad(60);
		}
	}
		

		
	public static class itempagecommons {
		// commons
		private static Button cartButton = new Button("cartButton", By.xpath("//a[@class='shopping_cart_link']"));
		private static ListBox productSorter = new ListBox("backToProductsButton", By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select"));
		

		public static void clickCart() {
			ReportLog.setTestStep("Click Cart");
			cartButton.click();
			WebControl.waitForPageToLoad(60);
		}		
		
		public static void sortItemsNameAtoZ() {
			ReportLog.setTestStep("Sort from Name (A to Z)");
			productSorter.selectByVisibleText("Name (A to Z)");
			WebControl.waitForPageToLoad(60);
		}
		
		public static void sortItemsNameZtoA() {
			ReportLog.setTestStep("Sort from Name (Z to A)");
			productSorter.selectByVisibleText("Name (Z to A)");
			WebControl.waitForPageToLoad(60);
		}
		
		public static void sortItemsPriceLowToHigh() {
			ReportLog.setTestStep("Sort from Price (low to high)");
			productSorter.selectByVisibleText("Price (low to high)");
			WebControl.waitForPageToLoad(60);
		}
		
		public static void sortItemsPriceHighToLow() {
			ReportLog.setTestStep("Sort from Price (high to low))");
			productSorter.selectByVisibleText("Price (high to low)");
			WebControl.waitForPageToLoad(60);
		}		
	}
		
		
	
	public static class footers {
		// footers
		private static Button twitter = new Button("twitter", By.xpath("//*[@id='page_wrapper']/footer/ul/li[1]/a"));
		private static Button facebook = new Button("facebook", By.xpath("//*[@id='page_wrapper']/footer/ul/li[2]/a"));
		private static Button linkedin = new Button("linkedin", By.xpath("//*[@id='page_wrapper']/footer/ul/li[3]/a"));
		
		public static void clicktwitter() {
			ReportLog.setTestStep("Click 'Twitter' from footers");
			twitter.click();
		}
		
		public static void clickFacebook() {
			ReportLog.setTestStep("Click 'Facebook' from footers");
			facebook.click();
		}
		
		public static void clickLinkedIn() {
			ReportLog.setTestStep("Click 'Linkedin' from footers");
			linkedin.click();
		}
	}
	
	

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
	
	
	
	public static class checkOutOverviewPage {
		private static Button finishButton = new Button("finishButton", By.xpath("//button[@id='finish']"));
		
		
		public static void finishButton() {
			ReportLog.setTestStep("Click finish");
			finishButton.click();
		}	
	}
	
	
	public static class checkOutLastPage {
		private static Button backHome = new Button("backHome", By.xpath("//button[@id='back-to-products']"));
		
		public static void backHomeButton() {
			ReportLog.setTestStep("Click Home button");
			backHome.click();
		}	
		
	}
}
