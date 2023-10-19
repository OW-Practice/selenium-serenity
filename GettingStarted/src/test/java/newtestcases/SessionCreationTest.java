package newtestcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import steps.InspifySteps;

@RunWith(SerenityRunner.class)

@WithTag("smoke")
public class SessionCreationTest {
	Faker faker = new Faker();
	private EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
	String username;
	String password;

	String sessionTitle;
	String sessionDesc;

	@Managed
	WebDriver driver;

	@Steps
	InspifySteps inspify;

	@Title("Login to inspify site")
	@Before
	public void login() throws InterruptedException {
		username = environmentVariables.getProperty("username");
		password = environmentVariables.getProperty("password");
		sessionTitle = faker.company().name();
		sessionDesc = faker.lorem().paragraph(5);

		inspify.launchURL();
		inspify.login(username, password);
		inspify.goToProfile();
		inspify.verifyLogin();
	}

	@Title("Operations on sessions")
	@Test
	public void sessionCreationTest() throws InterruptedException {
		inspify.goToCalendar();
		inspify.clickOnCreateButton();
		inspify.CreateSession(sessionTitle, sessionDesc);
		inspify.VerifyIsSessionCreated(sessionTitle);
	}

	@Title("Logout from inspify")
	@After
	public void logout() throws InterruptedException {
		inspify.logout();
		inspify.verifyLogout();
	}
}
