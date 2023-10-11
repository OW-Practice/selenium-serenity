package RandomString.java;

import java.lang.annotation.Retention;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import pages.PlaceOrder;
import pages.UserLoginPage;
import steps.LaunchBlaze;

@RunWith(SerenityParameterizedRunner.class)
//@Retention(RUNTIME)
@Concurrent(threads="4")
@UseTestDataFrom(value = "D:\\eclipse\\carswaley\\src\\test\\resources\\testdata\\data.csv")
public class RandomCredentials  {
	
	public String Username;
	public String Password;
		

		
		@TestData(columnNames = "Username,Password")
		//@Retention(RUNTIME)
		@Qualifier
	    public String qualifier(){return " - " + " Username = " + Username + " and " + " Password = " + Password + " should display " ;}
	
	

	
		Random objGenerator = new Random();
		int randomNumber = objGenerator.nextInt(100);
		String RegisteredUerName = this.Username+randomNumber+"@gmail.com";
		String username=  RegisteredUerName;
		String password = Password;
		
		
}
