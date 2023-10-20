package screenplayInitialTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class Intro1Test extends PageObject
{
	static Target CLICK_ON_HOMEPAGE_LOGIN_BUTTON 				=	Target.the("homepageLoginButton").locatedBy("//a[@id='login2']");
	static Target serviceLink									=	Target.the("service link").locatedBy("//*[text()='Services']");
	static Target USER_NAME_INPUT_FIELD 						=	Target.the("userNameInputField").locatedBy("//input[@id='loginusername']");
	static Target PASSWORD_INPUT_FIELD  						=	Target.the("passwordInputField").locatedBy("//input[@id='loginpassword']");
	static Target LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS 		=	Target.the("loginButtonAfterEnteringCredentials").locatedBy("#logInModal button.btn-primary");
	static Target CLICK_HOME_SECTION_ON_FOOTER					= 	Target.the("clickHomeSectionOnFooter").locatedBy("#navbarExample li.nav-item:nth-child(1)");
	static Target CLICK_ON_LAPTOPS_SECTION						= 	Target.the("clickonlaptopsSection").locatedBy(".list-group a:nth-child(3)");
	static Target CLICK_ON_SELECTED_LAPTOP_NAME					= 	Target.the("click_on_selected_laptop_name").locatedBy("#tbodyid > div:nth-child(1) h4.card-title");
	static Target CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP			= 	Target.the("click_add_to_cart_on_selected_laptop").locatedBy("#tbodyid a");
	static Target  CLICK_ON_CART_SECTION_ON_FOOTER				= 	Target.the("click_on_cart_section_on_footer").locatedBy("#navbarExample li.nav-item:nth-child(4)");
	static Target  VERIFY_LAPTOP_NAME_IN_CART 					= 	Target.the(" verify_laptop_name_in_cart").locatedBy("#tbodyid > tr > td:nth-child(2)");
	static Target  CONFIRM_CLOSE 								= 	Target.the("confirm_close").locatedBy("#signInModal button.btn-secondary");
	static Target ALERT_OK_AFTERPLACING_ORDER 					= 	Target.the("alertOK").locatedBy("div.sa-confirm-button-container");
	static Target  CLICK_ON_PLACE_ORDER 						= 	Target.the("click_on_place_order").locatedBy("#page-wrapper button.btn-success");
	static Target  CLICK_ON_LOGOUT 								= 	Target.the("click_on_logout").locatedBy("#logout2");
	static Target PLACE_ORDER_FORM_NAME_INPUT_FIELD				= 	Target.the("place_order_form_name_input_field").locatedBy("div.form-group input#name");
	static Target PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD			= 	Target.the("place_order_form_country_input_field").locatedBy("div.form-group input#country");
	static Target PLACE_ORDER_FORM_CITY_INPUT_FIELD				= 	Target.the("place_order_form_city_input_field").locatedBy("div.form-group input#city");
	static Target PLACE_ORDER_FORM_MONTH_INPUT_FIELD			= 	Target.the("place_order_form_month_input_field").locatedBy("div.form-group input#month");
	static Target PLACE_ORDER_FORM_CREDICARD_INPUT_FIELD		= 	Target.the("place_order_form_year_input_field").locatedBy("div.form-group input#card");
	static Target PLACE_ORDER_FORM_YEAR_FIELD					=	Target.the("place_order_form_creditcard_input_field").locatedBy("div.form-group input#year");
	static Target PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON 	= 	Target.the("place_order_form_click_on_purchase_button").locatedBy("#orderModal Button.btn.btn-primary"); 
	
	
	@Managed
	public WebDriver driver;
	Actor actor = new Actor("DemoBlaze");
	
	
	@Before
	public <T extends Actor>void demoblaunch()
	{
		actor.can(BrowseTheWeb.with(driver));
		actor.attemptsTo(Open.url("https://www.demoblaze.com/"));
	}



	@Title("actor login into DEMO BLAZE application in screenplay")
	@Test
	public <T extends Actor>void loginDBApp() {
//		actor.can(BrowseTheWeb.with(driver));
//		actor.attemptsTo(Open.url("https://www.demoblaze.com/"));

		actor.attemptsTo(Click.on(CLICK_ON_HOMEPAGE_LOGIN_BUTTON));

		actor.wasAbleTo(Enter.theValue("harika3090@gmail.com").into(USER_NAME_INPUT_FIELD));
		actor.wasAbleTo(Enter.theValue("harika3010").into(PASSWORD_INPUT_FIELD));
		actor.attemptsTo(Click.on(LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(CLICK_HOME_SECTION_ON_FOOTER).isDisplayed());
		actor.attemptsTo(Click.on(CLICK_HOME_SECTION_ON_FOOTER));
		System.out.println("Home section which is in footer clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(CLICK_ON_LAPTOPS_SECTION).isDisplayed());
		actor.attemptsTo(Click.on(CLICK_ON_LAPTOPS_SECTION));
		System.out.println("laptop section is clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(CLICK_ON_SELECTED_LAPTOP_NAME).isDisplayed());
		actor.attemptsTo(Click.on(CLICK_ON_SELECTED_LAPTOP_NAME));
		System.out.println("Selected laptop is clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP).isDisplayed());
		actor.attemptsTo(Click.on(CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP));
		System.out.println("add to cart on laptop is clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(CLICK_ON_CART_SECTION_ON_FOOTER).isDisplayed());
		actor.attemptsTo(Click.on(CLICK_ON_CART_SECTION_ON_FOOTER));
		System.out.println("cart section on footer is clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(CLICK_ON_PLACE_ORDER).isDisplayed());
		actor.attemptsTo(Click.on(CLICK_ON_PLACE_ORDER));
		System.out.println("place order button is clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_NAME_INPUT_FIELD).isDisplayed());
		actor.wasAbleTo(Enter.theValue("3010").into(PLACE_ORDER_FORM_NAME_INPUT_FIELD));
		System.out.println("Value entered into NAME input field");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD).isDisplayed());
		actor.wasAbleTo(Enter.theValue("INDIA").into(PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD));
		System.out.println("Value entered into COUNTRY input field");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_CITY_INPUT_FIELD).isDisplayed());
		actor.wasAbleTo(Enter.theValue("HYD").into(PLACE_ORDER_FORM_CITY_INPUT_FIELD));
		System.out.println("Value entered into CITY input field");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_CREDICARD_INPUT_FIELD).isDisplayed());
		actor.wasAbleTo(Enter.theValue("1234 5867 3645 2675").into(PLACE_ORDER_FORM_CREDICARD_INPUT_FIELD));
		System.out.println("Value entered into CREDITCARD input field");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_MONTH_INPUT_FIELD).isDisplayed());
		actor.wasAbleTo(Enter.theValue("OCT").into(PLACE_ORDER_FORM_MONTH_INPUT_FIELD));
		System.out.println("Value entered into MONTH input field");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_YEAR_FIELD).isDisplayed());
		actor.wasAbleTo(Enter.theValue("2023").into(PLACE_ORDER_FORM_YEAR_FIELD));
		System.out.println("Value entered into MONTH input field");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Ensure.that(PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON).isDisplayed());
		actor.wasAbleTo(Click.on(PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON));
		System.out.println("actor clicked on Purchase order button");
		driver.navigate().refresh();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(CLICK_ON_LOGOUT));
		System.out.println("actor logout from demoblaze application");
	}

}
