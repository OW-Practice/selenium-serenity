package AssertionsScreenplay;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject
{
	 private User user;

	    @Managed
	    WebDriver webDriver;

	    @Before
	    public void setupActor() {
	        user = new User("TestUser");
	        user.can(BrowseTheWeb.with(webDriver));
	    }

	    @Test
	    public void should_login_and_logout_successfully() throws InterruptedException {
	    	user.attemptsTo(LoginTasks.openLoginPage());
	    	Thread.sleep(3000);
	    	user.attemptsTo(LoginTasks.loginWithCredentials("harika3090@gmail.com","harika3010"));
	    	user.attemptsTo(LoginTasks.logout());
//	        then(user).should(seeThat(LoginQuestions.loginSuccessful(), is(true)));
//	        then(user).should(seeThat(LoginQuestions.logoutButtonPresent(), is(true));
//
//	        when(user).attemptsTo(LoginTasks.logout());
//	        then(user).should(seeThat(LoginQuestions.logoutButtonPresent(), is(false));
	    }
}
