package newtestcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import steps.InspifySteps;

@RunWith(SerenityRunner.class)
public class CreateStorybook {
	Faker faker = new Faker();
	private EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
	String username;
	String password;

	String sessionTitle, sessionDesc;
	String SBTitle, SBSubTitle;

	@Managed
	WebDriver driver;

	@Steps
	InspifySteps inspify;

	@Title("Login to inspify site")
	@Before
	public void login() {
		username = environmentVariables.getProperty("username");
		password = environmentVariables.getProperty("password");
		sessionTitle = faker.company().name();
		sessionDesc = faker.lorem().paragraph(5);

		inspify.launchURL();
		inspify.login(username, password);
		inspify.goToProfile();
		inspify.verifyLogin();
	}

	@Test
	public void createSB() throws InterruptedException {
		SBTitle = "SBTitle" + faker.number().randomDouble(5, 1, 1000);
		SBSubTitle = "SBSubTitle" + faker.number().randomDouble(4, 1, 1000);

		inspify.goToStorybookMenu();
		inspify.createSB(SBTitle, SBSubTitle, "src\\test\\resources\\image.jpg");
		inspify.verifyIsSBCreated(SBTitle, SBSubTitle);
	}
}
