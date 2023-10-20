package screenplayPOMTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class URLlaunchTest extends PageObject {

	@Managed
	WebDriver driver;
	
//	private TestDataLoader testdataloader=new TestDataLoader();
//	String SiteURL=testdataloader.getSiteURL();
	
	
	Faker faker=new Faker();
	String Massage="Hi this is "+faker.name().name();
	Actor user=Actor.named("harika");
	
	@Before
	public void launchbrowser()
	{
		user.can(BrowseTheWeb.with(driver));
		user.attemptsTo(Open.url("https://demo.seleniumeasy.com/"));
	}
	
	
	@Test
	public void handleInputForms()
	{
		String ExpectedTitle="Your Expected Title";
		user.attemptsTo(SingleInputFormTest.inputMessage(Massage));
//				Ensure.thatThePageTitle(),VerifyPageTitle.is(ExpectedTitle)));
		
	}
}
