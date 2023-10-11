package testcases;

import java.lang.annotation.Target;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.springframework.beans.factory.annotation.Autowired;

import RandomString.java.RandomCredentials;
import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
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
@Concurrent(threads="4")
@UseTestDataFrom(value = "D:\\eclipse\\carswaley\\src\\test\\resources\\testdata\\data.csv")
//@RunWith(SerenityParameterizedRunner.class)
//@Narrative( text = { "Demo Blaze Test Case Flow" })

public class DemoBlaze_flow extends PageObject  {
	public String username;
	public String password;
	
		@Managed
		WebDriver driver;
		// Set Microsoft Edge options
        

		@Steps
		LaunchBlaze browser;
		UserLoginPage login;
		PlaceOrder placeorder;
		
		
		@TestData(columnNames = "Username,Password")
		
		//@Autowired
		@Qualifier
	    public String qualifier(){return " - " + " Username = " + username + " and " + " Password = " + password + " should display " ;}
		
		@Title("Demo Blaze Application")
		@Test
	//	@Pending
		
		
		public void userLoginToApp() {
			Random objGenerator = new Random();
			int randomNumber = objGenerator.nextInt(1000);
			String RegisteredUerName = username+randomNumber+"@gmail.com";
			open();
			browser.userNavigateToDashboard();
			browser.customerRegister(RegisteredUerName,password);
			login.navigateToHome(RegisteredUerName,password);
			login.verifyHomeScreen();
			placeorder.purchaseOrder();
			placeorder.completeOrder();
			
			
		}
}

