package Screenplay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import DemoBlaze.DBAppLocators;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;

@RunWith(SerenityRunner.class)
public class Screenplay extends PageObject{
	 Actor user = new  Actor("demo blaze");
	 DBAppLocators demoblazeloc;
	@Managed
    private WebDriver driver;
	@Test
    public <T extends Actor> void browserLaunchDB() {
        
         
          user.can(BrowseTheWeb.with(driver));
          user.attemptsTo(Open.url("https://www.demoblaze.com/"));
          
          user.attemptsTo(Ensure.that(ScreenplayLoc.CLICK_ON_HOMEPAGE_LOGIN_BUTTON).isDisplayed());
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ON_HOMEPAGE_LOGIN_BUTTON));
          user.attemptsTo(Enter.theValue("harika3090@gmail.com").into(ScreenplayLoc.USER_NAME_INPUT_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("harika3010").into(ScreenplayLoc.PASSWORD_INPUT_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Click.on(ScreenplayLoc.LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS));
          
          
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_HOME_SECTION_ON_FOOTER));
          user.attemptsTo(Ensure.that(ScreenplayLoc.CLICK_ON_LAPTOPS_SECTION).isDisplayed());
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ON_LAPTOPS_SECTION));
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ON_SELECTED_LAPTOP_NAME));
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP));
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ON_LAPTOPS_SECTION));
//          NEED TO PUT ALERTS SYNTAX
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ON_CART_SECTION_ON_FOOTER));
          user.attemptsTo(Click.on(ScreenplayLoc.CLICK_ON_PLACE_ORDER));
          user.attemptsTo(Enter.theValue("hari").into(ScreenplayLoc.PLACE_ORDER_FORM_NAME_INPUT_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("xyz").into(ScreenplayLoc.PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("1234").into(ScreenplayLoc.PLACE_ORDER_FORM_CITY_INPUT_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("sdfr").into(ScreenplayLoc.PLACE_ORDER_FORM_CREDITCARD_YEAR_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("242ft").into(ScreenplayLoc.PLACE_ORDER_FORM_MONTH_INPUT_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("sd34").into(ScreenplayLoc.PLACE_ORDER_FORM_MONTH_YEAR_FIELD).thenHit(Keys.ENTER));
          user.attemptsTo(Enter.theValue("sdi").into(ScreenplayLoc.PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON).thenHit(Keys.ENTER));
	}
}


//Wait.until(Enabled.of(DemoBlazeLocators.GOOGLE_SEARCH_INPUTFIELD).viewedBy(user).asAQuestion(),is(true));
//when(user).attemptsTo(
//		Enter.theValue("harika").into(By.xpath("//textarea[@type='search']"))
//		);

// perform Wait
//actor.attemptsTo(Wait.until(
// WebElementQuestion.the(LoginForm.PASSWORD) , WebElementStateMatchers.isEnabled()
//).forNoLongerThan(30).seconds()) 


//assert with waiting
//actor.should(EventualConsequence.eventually(GivenWhenThen.seeThat(
//WebElementQuestion.the(LoginForm.PASSWORD),
//WebElementStateMatchers.isEnabled())
//).waitingForNoLongerThan(30).seconds())

//actor.attemptsTo(Enter.theValue("...").into(LoginForm.USERNAME).thenHit(Keys.ENTER));

//user.should(EventualConsequence.eventually(GivenWhenThen.seeThat(WebElementQuestion.the(DemoBlazeLocators.GOOGLE_SEARCH_INPUTFIELD),
//WebElementStateMatchers.isEnabled())));
//user.attemptsTo(Wait.until(WebElementQuestion.the(DemoBlazeLocators.GOOGLE_SEARCH_INPUTFIELD),WebElementStateMatchers.isEnabled()));
//user.attemptsTo(Enter.theValue("harika3010@gmail.com").into(DemoBlazeLocators.GOOGLE_SEARCH_INPUTFIELD).thenHit(Keys.ENTER));
//When(user).attemptsTo(
//	Enter.theValue("harika").into(By.xpath("//textarea[@type='search']"))
//	);