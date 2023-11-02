package testCase;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;

import static org.mockito.ArgumentMatchers.eq;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Display;

import Questions.LoginQuestions;
import ScreenplayActions.LoginAction;
import ScreenplayPages.LoginWithCredentials;

@RunWith(SerenityRunner.class)
public class ScreenplayLoginTest extends PageObject {
	@Managed(driver = "chrome")
	WebDriver driver;
	// LoginTask task;
	LoginAction logaction;
	LoginWithCredentials lp;
	LoginQuestions LQ;
	//WebElement sourceElement1 = driver.findElement(By.cssSelector("[id='board']>li:nth-child(1)"));
	//WebElement targetElement2 = driver.findElement(By.cssSelector("[id='board']>li:nth-child(1)"));
	private static Actor user = Actor.named("User");

	@Before
	public void set_up_actor() {

		user.can(BrowseTheWeb.with(driver));
		open();

	}

	@Test
	public void boardCreation() {
		user.attemptsTo(lp.clickOnLoginLink());
		//user.attemptsTo(lp.invalidCreds("vikas+advisor1@finlink.de", "12345678"));
		user.attemptsTo(lp.enterUsername("narasimha.gadwala@optimworks.com"));
		user.attemptsTo(lp.clickOnContinueBtn());
		//user.attemptsTo(lp.clickOnNextButton());
		user.attemptsTo(lp.enterPassword("Nani@1998"));
		user.attemptsTo(lp.clickLoginBtn());
		//user.attemptsTo(lp.selectTrelloOption());
		user.attemptsTo(lp.clickOnCreateMenu());
		user.attemptsTo(lp.selectCreateBoard());
		user.attemptsTo(lp.enterBoardTitle("optimworks"));
		user.attemptsTo(lp.clickCreateButton());
		user.attemptsTo(lp.enterListTitle("opt1"));
		user.attemptsTo(lp.clickOnaddListButton());
		user.attemptsTo(lp.enterListTitle("opt2"));
		user.attemptsTo(lp.clickOnaddListButton());
		user.attemptsTo(lp.enterListTitle("opt3"));
		user.attemptsTo(lp.clickOnaddListButton());
		//user.should(seeThat());
		//Actions user1 = new Actions(driver);
	    //user.dragAndDrop(sourceElement1, targetElement2).build().perform();;
	    //
	}

}
