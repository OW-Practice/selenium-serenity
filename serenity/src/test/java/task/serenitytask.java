package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;

public class serenitytask implements Task  {
	private final String username;
	private final String password;
	
	//public credentials(String username, String password) {
		//this.username=username;
	//	this.password=password;
	//}
	
	public serenitytask(String username, String password) {
        this.username = username;
        this.password = password;
	}
	
	@Managed
	public WebDriver driver;
	Actor actor = new Actor("DemoBlaze");
	screenplaylocaters locaters;

	public <T extends Actor> void demoblaunch() {
		actor.can(BrowseTheWeb.with(driver));
		actor.attemptsTo(Open.url("https://www.demoblaze.com/"));
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(locaters.CLICK_ON_HOMEPAGE_LOGIN_BUTTON));

		actor.wasAbleTo(Enter.theValue(username).into(locaters.USER_NAME_INPUT_FIELD));

		actor.wasAbleTo(Enter.theValue(password).into(locaters.PASSWORD_INPUT_FIELD));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actor.attemptsTo(Click.on(locaters.LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actor.attemptsTo(Ensure.that(locaters.CLICK_HOME_SECTION_ON_FOOTER).isDisplayed());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actor.attemptsTo(Click.on(locaters.CLICK_HOME_SECTION_ON_FOOTER));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Home section which is in footer clicked");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actor.attemptsTo(Ensure.that(locaters.CLICK_ON_LAPTOPS_SECTION).isDisplayed());

		actor.attemptsTo(Click.on(locaters.CLICK_ON_LAPTOPS_SECTION));

		System.out.println("laptop section is clicked");

		actor.attemptsTo(Ensure.that(locaters.CLICK_ON_SELECTED_LAPTOP_NAME).isDisplayed());

		actor.attemptsTo(Click.on(locaters.CLICK_ON_SELECTED_LAPTOP_NAME));

		System.out.println("Selected laptop is clicked");

		actor.attemptsTo(Ensure.that(locaters.CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP).isDisplayed());

		actor.attemptsTo(Click.on(locaters.CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP));

		System.out.println("add to cart on laptop is clicked");

		actor.attemptsTo(Ensure.that(locaters.CLICK_ON_CART_SECTION_ON_FOOTER).isDisplayed());

		actor.attemptsTo(Click.on(locaters.CLICK_ON_CART_SECTION_ON_FOOTER));

		System.out.println("cart section on footer is clicked");

		actor.attemptsTo(Ensure.that(locaters.CLICK_ON_PLACE_ORDER).isDisplayed());

		actor.attemptsTo(Click.on(locaters.CLICK_ON_PLACE_ORDER));

		System.out.println("place order button is clicked");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_NAME_INPUT_FIELD).isDisplayed());

		actor.wasAbleTo(Enter.theValue("3010").into(locaters.PLACE_ORDER_FORM_NAME_INPUT_FIELD));

		System.out.println("Value entered into NAME input field");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD).isDisplayed());

		actor.wasAbleTo(Enter.theValue("INDIA").into(locaters.PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD));

		System.out.println("Value entered into COUNTRY input field");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_CITY_INPUT_FIELD).isDisplayed());

		actor.wasAbleTo(Enter.theValue("HYD").into(locaters.PLACE_ORDER_FORM_CITY_INPUT_FIELD));

		System.out.println("Value entered into CITY input field");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_CREDICARD_INPUT_FIELD).isDisplayed());

		actor.wasAbleTo(Enter.theValue("1234 5867 3645 2675").into(locaters.PLACE_ORDER_FORM_CREDICARD_INPUT_FIELD));

		System.out.println("Value entered into CREDITCARD input field");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_MONTH_INPUT_FIELD).isDisplayed());

		actor.wasAbleTo(Enter.theValue("OCT").into(locaters.PLACE_ORDER_FORM_MONTH_INPUT_FIELD));

		System.out.println("Value entered into MONTH input field");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_YEAR_FIELD).isDisplayed());

		actor.wasAbleTo(Enter.theValue("2023").into(locaters.PLACE_ORDER_FORM_YEAR_FIELD));

		System.out.println("Value entered into MONTH input field");

		actor.attemptsTo(Ensure.that(locaters.PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON).isDisplayed());

		actor.wasAbleTo(Click.on(locaters.PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON));

		System.out.println("actor clicked on Purchase order button");

		// driver.navigate().refresh();

		actor.attemptsTo(Click.on(locaters.CLICK_ON_LOGOUT));

		System.out.println("actor logout from demoblaze application");

	}

}
