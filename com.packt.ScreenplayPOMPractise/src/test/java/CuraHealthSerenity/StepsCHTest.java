package CuraHealthSerenity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
 
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class StepsCHTest extends PageObject {
	private testDataLoader testDataLoader = new testDataLoader();
	String username = testDataLoader.getUsername();
	String password = testDataLoader.getPassword();
	
	@Managed
	WebDriver driver;
	@Steps
	StepCHTest stepCuraHealth;
	
	@Before
	public void CuraHealthPatient()
	{
		stepCuraHealth.CuraHealthCareLoginOperation(username, password);}
	
	@Test
	public void inbetween(){
		stepCuraHealth.CuraHealthCareBookApptOperations();
		stepCuraHealth.CuraHealthCareLogoutOperation();}
	
	
	
	
		
}
