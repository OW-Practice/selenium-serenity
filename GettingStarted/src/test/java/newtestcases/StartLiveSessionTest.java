package newtestcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.InspifySteps;

@UseTestDataFrom(value = "D:\\Projects\\Automation\\Serenity\\GettingStarted\\src\\test\\resources\\CSVFileRamya.csv")
@RunWith(SerenityParameterizedRunner.class)
//@Concurrent(threads = "4")
public class StartLiveSessionTest {
	private String username;
	private String password;

	@Managed
	WebDriver driver;

	@Steps
	InspifySteps inspify;

	@TestData(columnNames = "Username, Password")
	@Qualifier
	public String qualifier() {
		return " - " + " Username = " + username + " and " + " Password = " + password + " should display ";
	}

	@Title("Login to inspify site")
	@Before
	public void login() throws InterruptedException {
		inspify.launchURL();
		inspify.login(username, password);
		inspify.goToProfile();
		inspify.verifyLogin();
	}

	@Title("Operations on sessions")
	@Test
	public void startLiveSessionTest() throws InterruptedException {
		inspify.goToCalendar();
		inspify.startLiveSession();
		inspify.verifyIsLiveSessionLoungeDisplayed();
		// inspify.acceptPermissions();
		// inspify.startSession();
		// inspify.verifyIsLiveSessionStarted();
	}

	@Title("Logout from inspify")
	@After
	public void logout() throws InterruptedException {
		inspify.logout();
		inspify.verifyLogout();
	}

}
