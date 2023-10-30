package ScreenplayCodeOptimization;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;


public class methodsTest implements Task
{
	@Managed
	WebDriver driver;
	private String username;
	private String password;

	public methodsTest(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	public static Performable launchTrelloURL()
	{
		return Task.where("{0} launch browser and the login page", Open.url("https://trello.com/home"));
	}

	
	public static Performable loginTrelloWithCredentials(String Username, String Password) {
        return Task.where("{0} logs in with credentials",
        	Click.on(TrelloLocatorsTest.launchLoginButton),	
            Enter.theValue(Username).into(TrelloLocatorsTest.userName),
            Click.on(TrelloLocatorsTest.confirmUsername),
            Enter.theValue(Password).into(TrelloLocatorsTest.password),
            Click.on(TrelloLocatorsTest.submitLoginButton)
        );
	}
	
	public static Performable logout() {
        return Task.where("{0} logs out",
            Click.on(TrelloLocatorsTest.homescreenLogoutOption),
            Click.on(TrelloLocatorsTest.logoutButton)
        );
    }
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}
}
