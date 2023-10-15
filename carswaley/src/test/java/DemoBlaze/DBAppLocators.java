package DemoBlaze;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DBAppLocators {
	
	public static By CLICKING_ON_USERTO_LOGIN 				= By.cssSelector("#navbarExample li:nth-child(5)");
	public static By USER_NAME_INPUT 						= By.cssSelector("input#loginusername");
	public static By PASSWORD_INPUT 						= By.cssSelector("input#loginpassword");
	public static By CLICK_ON_LOGIN 						= By.cssSelector("#logInModal button.btn-primary");
	public static By CLICK_ON_HOME 						= By.cssSelector("#navbarExample li.nav-item:nth-child(1)");
	public static By CLICK_ON_PHONES 						= By.cssSelector(".list-group a:nth-child(2)");
	public static By CLICK_ON_SELECTED_PHONE 				= By.cssSelector("#tbodyid > div:nth-child(1) a.hrefch");
	public static By CLICK_ON_ADDCART 						= By.cssSelector("a.btn-lg");
	public static By CLICK_ON_CART							= By.cssSelector("#navbarExample li.nav-item:nth-child(4)");
	public static By PHONE_NAME_IN_CART 					= By.cssSelector("#tbodyid td:nth-child(2)");
	public static By CLICK_ON_DELETE 						= By.cssSelector("#tbodyid td:nth-child(4) a");
	public static By CLICK_ON_LAPTOPS 						= By.cssSelector(".list-group a:nth-child(3)");
	public static By CLICK_ON_SELECTED_LAPTOP 				= By.cssSelector("#tbodyid > div:nth-child(1) h4.card-title");
	public static By CLICK_ADD_TO_CART_LAPTOP 				= By.cssSelector("#tbodyid a");
	public static By LAPTOP_NAME_IN_CART 					= By.cssSelector("#tbodyid > tr > td:nth-child(2)");
	public static By CONFIRM_CLOSE 						= By.cssSelector("#signInModal button.btn-secondary");
	public static By CLICK_ON_MONITORS 					= By.cssSelector(".list-group a:nth-child(4)");
	public static By CLICK_ON_SELECTED_MONITOR 			= By.cssSelector("#tbodyid > div:nth-child(1) h4.card-title");
	public static By MONITOR_NAME_IN_CART 					= By.cssSelector("#tbodyid td:nth-child(2)");
	public static By CLICK_PLACE_ORDER 					= By.cssSelector("#page-wrapper button.btn-success");
	public static By CLICK_LOGOUT 							= By.cssSelector("#logout2");
	public static By NAME_INPUT 							= By.cssSelector("div.form-group input#name");
	public static By COUNTRY_INPUT 						= By.cssSelector("div.form-group input#country");
	public static By CITY_INPUT 							= By.cssSelector("div.form-group input#city");
	public static By CREDITCARD_INPUT 						= By.cssSelector("div.form-group input#card");
	public static By MONTH_INPUT 							= By.cssSelector("div.form-group input#month");
	public static By YEAR_INPUT 							= By.cssSelector("div.form-group input#year");
	public static By CLICK_ON_PURCHASE 					= By.cssSelector("#orderModal Button.btn.btn-primary");
	public static By CLICK_ON_SIGNUP_BUTTON						= By.cssSelector("#signin2");
	public static By SIGNIN_USERNAME				= By.cssSelector("#sign-username");
	public static By SIGNIN_PASSWORD				= By.cssSelector("#sign-password");
	public static By CONFIRM_SIGNUP_BUTTON = By.cssSelector("button[onclick='register()']");
//	public static By CONFIRM_ORDER_PLACE = By.cssSelector("div.sa-confirm-button-container");
//	public static By CONFIRM_ORDER_PLACE = By.cssSelector("[data-dismiss='modal']");
	public static By CONFIRM_ORDER_PLACE = By.cssSelector("div.showSweetAlert div.sa-button-container div.sa-confirm-button-container");
	public static By CLOSE_PLACEORDER_FORM =By.xpath("//h5[text()='Place order']/..//button[@data-dismiss='modal']");
	public static By GOOGLE_SEARCH_INPUTFIELD = By.xpath("//textarea[@type='search']");
}
