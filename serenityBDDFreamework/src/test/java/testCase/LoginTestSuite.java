package testCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityParameterizedRunner.class)
public class LoginTestSuite extends PageObject{
	
	@Managed(driver = "firefox")
	WebDriver driver;
	
	@Test
	public void loginToApplication() {
		
		open();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//getDriver().findElement(By.name("username")).sendKeys("admin");
		//getDriver().findElement(By.name("password")).sendKeys("admin123");
		//getDriver().findElement(By.xpath("//div[contains(@class,'orangehrm-login-action')]")).click();
		
		//$("[class='form-input']").sendKeys("admin");
		//$("//*[@type='password']").sendKeys("admin123");
		//$("//*[contains(@class,'btn-lg')]").click();
		
		WebElementFacade logo = find(By.cssSelector("div>img"));
		logo.isPresent();
	    typeInto($("[class='form-input']"),"jhansi+admadv@finlink.de");
	    typeInto($("//*[@type='password']"),"12345678");
	    WebElementFacade submitButton = find(By.xpath("//*[contains(@class,'btn-lg')]"));
	    submitButton.shouldBeVisible();
		submitButton.click();
		 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		WebElementFacade searchInputField = find(By.cssSelector("fl-autocomplete>input"));
		searchInputField.shouldBePresent();
		

		
	    //$("//*[contains(@class,'btn-lg')]").click();
	}

}
