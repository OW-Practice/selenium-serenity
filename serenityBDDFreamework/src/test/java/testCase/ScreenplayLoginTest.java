package testCase;

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
import org.openqa.selenium.remote.CapabilityType;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders.Display;

import Questions.LoginQuestions;
import ScreenplayActions.LoginAction;
import ScreenplayPages.LoginWithCredentials;
//import ScreenplayTask.LoginTask;
//import tasks.LoginTask;

@RunWith(SerenityRunner.class)
public class ScreenplayLoginTest extends PageObject {
	@Managed(driver="chrome")
    WebDriver driver;
	//LoginTask task;
	LoginAction logaction;
	LoginWithCredentials lp;
	LoginQuestions LQ;
    private static Actor user = Actor.named("User");
    
    @Before
    public void set_up_actor() {
    	String name = "1542";
       //user.can(BrowseTheWeb.with(driver).setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true));
    	 user.can(BrowseTheWeb.with(driver));
    	 //open();
    	 user.attemptsTo(Open.url("https://admin.finlink-staging.de/login"));
    	 user.attemptsTo(
    			 //Ensure.that(name).isEqualToIgnoringCase("1542").into("[src='./assets/finlink-logo.svg']")
    			 
    			 );
    	 
    }



    @Test
    public void userCanLogin() {
        user.attemptsTo(logaction.withCredentials("jhansi+admadv@finlink.de", "12345678"));


        // Add assertions or verifications here to validate the successful login
    }
    @Test
    public void loginWithInvalidCreds() {
    	user.attemptsTo(lp.invalidCreds("vikas+advisor1@finlink.de", "12345678"));
    }
    
} 

