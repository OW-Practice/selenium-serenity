package CuraHealthScreenplayProject;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;

import static  net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@RunWith(SerenityRunner.class)
public class CuraHealthTest extends PageObject{
	
	@Managed(uniqueSession=true)
	WebDriver driver;
	
	Actor curahealth=Actor.named("cura.herokuapp");
		
	
	@Before
	public void setThebrowser()
	{
		OnStage.setTheStage(new OnlineCast());
		driver.manage().window().maximize();
	}
	
	@Test
	public void CuraHealthLogin()
	{
		
			curahealth.can(BrowseTheWeb.with(driver));
//			curahealth.attemptsTo(Open.browserOn().the(CuraHealthURLTest.class));
			curahealth.attemptsTo(Open.browserOn().thePageNamed("chpages.react"));
			curahealth.attemptsTo(LoginTest.predefinedcredentials());
			curahealth.attemptsTo(BookAppointmentTest.patientBook());
			curahealth.attemptsTo(HistoryTest.History());
			curahealth.attemptsTo(LogoutTest.lgout());
			
		}
	
	
//	@Test
//	public void ScreenplayCH() {
//		givenThat(curahealth).wasAbleTo(Open.browserOn().thePageNamed("chpages.react"));
//		when(curahealth).attemptsTo(CHloginTest.predefinedcredentials());
//		then(curahealth).should(seeThat(GetTextValue.ofTarget().containsString("")));
//		
		
//	}
	}

//Performable readProperties = ReadPropertiesFile.named("com.packt.ScreenplayPOMPractise\\serenity.properties");
//curahealth.attemptsTo(readProperties);
//RunWith(SerenityParameterizedRunner.class)
//@Concurrent(threads = "4")
//@UseTestDataFrom(value = "C:\\Users\\LENOVO\\Downloads\\DemoBlazeDataDrivenCSV\\src\\test\\resources\\testdata\\data.csv")
//@TestData(columnNames = "username,password")
//
//@Qualifier
//public String qualifier() {
//    return " - " + " Username = " + username + " and " + " Password = " + password +  "should display ";
//}