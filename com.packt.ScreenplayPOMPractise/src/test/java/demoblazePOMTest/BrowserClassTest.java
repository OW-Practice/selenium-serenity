package demoblazePOMTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class BrowserClassTest {
	@Managed
	WebDriver driver;
	

	
	Faker faker=new Faker();
	String ToBeDisplay="Hi this is "+faker.name().firstName();
	Actor robo=Actor.named("optim");
	
	@Before
	public void demoBlazelaunchPage()
	{
		robo.can(BrowseTheWeb.with(driver));
		robo.attemptsTo(Open.url("https://www.demoblaze.com/"));
	}
	
	
	@Test
	public void InputForm()
	{
		String ExpectedTitle="Your Expected Title";
		robo.attemptsTo(TaskClassTest.printingmessage(ToBeDisplay));
//				Ensure.thatTheCurrentPage(),VerifyPageTitle.is(ExpectedTitle));
//		Ensure.that(Text.of(driver.getTitle().equalsIgnoreCase("STORE")).answeredBy(robo))
//        .isEqualTo("Expected Page Title");
	}
}
