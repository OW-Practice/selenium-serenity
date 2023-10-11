package testCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.LoginPageSteps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import pages.DashboardPage;

@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value="C:\\Users\\admin\\serenityBDDFreamework\\src\\test\\resources\\csv.file" )
@UseTestDataFrom(value="C:/Users/admin/serenityBDDFreamework/src/test/resources/drivenFile/data.csv" )
@Concurrent(threads="4")
public class DataDrivenWithCsvTestSuite extends PageObject {
	private String username;
	private String password;
	
	/*public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}*/
	
	@Managed(driver = "firefox")
	WebDriver driver;
	@Steps
	LoginPageSteps login;
	DashboardPage dashboard;
	@TestData(columnNames = "Username, Password")
	
	@Qualifier
	public String qualifier() {return " - "+"Username = "+username+ "and" +"Password ="+password+"should display";}
	
	
	@Test
	public void login() {
		//driver.get("https://app.emlen-staging.io/login");
		open();
		login.verifyLoginPageIsDisplayed();
		login.enterUsername(username);
		login.clickProceedButton();
		login.verifyPasswordFiledDisplayed();
		login.enterPassword(password);
		login.clickonSubmitButton();
		dashboard.verifyDashboardPageDisplayed();
}
}


