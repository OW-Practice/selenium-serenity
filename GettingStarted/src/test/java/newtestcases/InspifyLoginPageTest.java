package newtestcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.InspifySteps;
import utilities.TestDataLoader;

@RunWith(SerenityRunner.class)
@Narrative(text = { "This spec is to test the login and log out" })
public class InspifyLoginPageTest {
	private TestDataLoader testDataLoader = new TestDataLoader();
	String username;
	String password;

	@Managed
	WebDriver driver;

	@Steps
	InspifySteps inspify;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Executed before class");
	}

	@Title("Login to inspify")
	@Before
	public void doLogin() {
		username = testDataLoader.getUsername();
		password = testDataLoader.getPassword();

		inspify.launchURL();
		inspify.login(username, password);
	}

	@Title("Verify login")
	@Test
	// @Issue("Issue while giving invalid creds")
	// @Issues("Issue while giving invalid creds and empty data")

	public void verifyLogin() {
		inspify.goToProfile();
		inspify.verifyLogin();
	}

	@Title("Logout from inspify")
	@Test
	// @Pending
	public void doLogut() {
		inspify.logout();

	}

	@Title("Verify logout")
	@After
	public void verifyLogout() {
		inspify.verifyLogout();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Executed after class");
	}
}
