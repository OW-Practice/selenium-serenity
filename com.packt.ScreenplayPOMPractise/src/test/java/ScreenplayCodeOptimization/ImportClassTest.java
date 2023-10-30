package ScreenplayCodeOptimization;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ImportClassTest extends PageObject{
	private ActorAsUser rami;
	public String username;
	public String password;
	
	@Managed
	public WebDriver driver;
	
	
	@Before
	public void browser()
	{
		rami=new ActorAsUser("TestUser");
		//rami.can(BrowseTheWeb.with(driver));
		
	}
	
	@Test
	public void UrlLoginLogout()
	
	{
		open();
		
		//rami.wasAbleTo(methodsTest.launchTrelloURL());
		rami.attemptsTo(methodsTest.loginTrelloWithCredentials(username, password));
		rami.attemptsTo(methodsTest.logout());
	}
	

}
