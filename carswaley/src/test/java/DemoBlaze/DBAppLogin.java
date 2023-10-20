package DemoBlaze;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class DBAppLogin extends PageObject {
	
	@Managed
	WebDriver driver;
	Utilities utilitiespage;
	DBAppLocators demoblazelocators;
	String email;
	String password;
	Faker faker = new Faker();
	@Title("login into Demoblaze application with valid credentials ")
	@Test
//	@Before
	public void DBLogin()
	{
	
		getDriver().get("https://www.demoblaze.com/");
//		open();	 
		String firstname = faker.name().firstName();
		System.out.println("User Firstname is : "+firstname);
		String lastname = faker.name().lastName();
		System.out.println("User Lastname is : "+lastname);
		String email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@domain.com";
		System.out.println("User Emailid is : "+email);
		String password= faker.name().firstName();
		System.out.println("User password is : "+password);
	
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_SIGNUP_BUTTON);
		utilitiespage.enterValueintoField(DBAppLocators.SIGNIN_USERNAME ,email);
		utilitiespage.enterValueintoField(DBAppLocators.SIGNIN_PASSWORD ,password);
		utilitiespage.mouseClick(DBAppLocators.CONFIRM_SIGNUP_BUTTON);
//		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
//		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
//		Alert alert = getAlert();
//		System.out.println(alert.getText());
//		alert.accept();
		utilitiespage.waitTimeforPageLoad(3000);
	
//		reusablemethods.waitTimeforPageLoad(3000);
		utilitiespage.mouseClick(DBAppLocators.CLICKING_ON_USERTO_LOGIN);
		utilitiespage.enterValueintoField(DBAppLocators.USER_NAME_INPUT ,email);
		utilitiespage.enterValueintoField(DBAppLocators.PASSWORD_INPUT ,password);
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_LOGIN);
		utilitiespage.waitTimeforPageLoad(2000);
		utilitiespage.assertionforpagetitle("STORE");
		System.out.println("DB home page launched");
//		utilitiespage.waitTimeforPageLoad(3000);
//		utilitiespage.mouseClick(DemoBlazeLocators.CLICK_ON_HOME);
		System.out.println("Assertion passed and Demoblaze home page after login is opened");

	}

}
