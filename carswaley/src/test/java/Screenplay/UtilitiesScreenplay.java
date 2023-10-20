package Screenplay;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import DemoBlaze.DBAppLocators;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class UtilitiesScreenplay {
	Actor user = new  Actor("demo blaze");
	DBAppLocators demoblazeloc;
	@Managed
   private WebDriver driver;
	public void Login_DB()
	{
		 user.attemptsTo(Click.on(DBAppLocators.CLICKING_ON_USERTO_LOGIN));
         user.attemptsTo(Enter.theValue("harika3090@gmail.com").into(DBAppLocators.USER_NAME_INPUT).thenHit(Keys.ENTER));
         user.attemptsTo(Enter.theValue("harika3010").into(DBAppLocators.PASSWORD_INPUT).thenHit(Keys.ENTER));
         user.attemptsTo(Click.on(DBAppLocators.CLICK_ON_LOGIN));
	}

}
