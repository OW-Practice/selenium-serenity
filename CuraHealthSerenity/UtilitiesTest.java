package CuraHealthSerenity;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;



public class UtilitiesTest extends PageObject{
	
	public void clickActionOnWebElement(By Locator){
		WebElementFacade clickOpr  = $(Locator);
		waitTimeforElementVisible(2000);
		clickOpr.isClickable();
		clickOpr.click();
	}
	
	public void waitTimeforElementVisible(int i){
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void typeIntoWebElement(By Locator,String value) {
		WebElementFacade SendKeysOpr  = $(Locator);
		waitTimeforElementVisible(2000);
		SendKeysOpr.isDisplayed();
		SendKeysOpr.clear();
		SendKeysOpr.type(value);
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
	
	public void assertionforpagetitle(String value)
	{
		String title=getDriver().getTitle();
		System.out.println(getTitle());
		Assert.assertTrue(title.contains(value));
		
	}

}
