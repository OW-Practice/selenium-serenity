package DemoBlaze;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Utilities  extends PageObject{
	

	@Managed
	WebDriver driver;
//	Faker faker = new Faker();
	String email;
	String password;
	
	public void mouseClick(By Locator)
	{
		WebElementFacade clickOpr  = $(Locator);
		clickOpr.isClickable();
		
		clickOpr.click();
	}
	
	
	public void enterValueintoField(By Locator,String value)
	{
		WebElementFacade SendKeysOpr  = $(Locator);
		SendKeysOpr.isDisplayed();
		SendKeysOpr.type(value);
		SendKeysOpr.type(value);
	}
	
	
	public void randomNameGeneratorMethod()
	{
//		System.out.println(faker.name().fullName());
		
//		String firstname = faker.name().firstName();
//		System.out.println("User Firstname is : "+firstname);
//		String lastname = faker.name().lastName();
//		System.out.println("User Lastname is : "+lastname);
//		String email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@domain.com";
//		System.out.println("User Emailid is : "+email);
//		String password= faker.name().firstName();
//		System.out.println("User password is : "+password);
//	
//		mouseClick(DemoBlazeLocators.CLICK_ON_SIGNUP_BUTTON);
//		enterValueintoField(DemoBlazeLocators.SIGNIN_USERNAME ,email);
//		enterValueintoField(DemoBlazeLocators.SIGNIN_PASSWORD ,password);
//		mouseClick(DemoBlazeLocators.CONFIRM_SIGNUP_BUTTON);
//		WebElementFacade confirmSignup = $("//div[@id='signInModal']");
//		confirmSignup.click();
//		div[@id='signInModal']
//		
	}
	
	public void waitTimeforPageLoad(int i)
	{
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitTimeforElementVisible(int i)
	{
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void assertionforpagetitle(String value)
	{
		String title=getDriver().getTitle();
		System.out.println(getTitle());
		Assert.assertTrue(title.contains(value));
		
	}
	
//	public void assertionforLogincredentialsByElementVisible()
//	{
//		Assert.assertTrue(containsElements(OrangeHrmLocators.adminButton));
//		
//	}

}
