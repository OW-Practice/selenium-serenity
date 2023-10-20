package TaskScreenplayPOMTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MainTest {
	
	@Managed
	WebDriver driver;
	
	
	Actor user = Actor.named("harika");
	
	
	@Before
	public void setTheStage()
	{
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Test
	public void user_Login_in_Successfully() throws InterruptedException
	{
		String username="harika3090@gmail.com";
		String password="harika3010";
		String nameinput="hari";
		String countryinput="INDIA";
		String cityinput="HYD";
		String creditcardinput="1248 3476 3875 3486";
		String monthinput="OCT";
		String yearinput="2486";
		user.can(BrowseTheWeb.with(driver));
		user.attemptsTo(Open.url("https://www.demoblaze.com/"));
		user.attemptsTo(LoginTask1Test.withCredentials(username, password));
		Thread.sleep(3000);
		user.attemptsTo(AddtoCartTask2Test.forProduct());
		user.attemptsTo(PlacingOrderTask3Test.placeorder(nameinput, countryinput, cityinput, creditcardinput, monthinput, yearinput));
//		user.attemptsTo(AcceptAlert.now());
	
	}
}


