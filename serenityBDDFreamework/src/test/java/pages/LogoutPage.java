package pages;

import org.junit.Assert;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutPage extends PageObject {
	
	public void clickOnProfile() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade profile = find(By.xpath("//*[@class='image']//parent::div"));
		profile.click();
	}
	
	public void clickOnLogout() {
		WebElementFacade logout = find(By.cssSelector("[role='menu'] [href='/logout']"));
		logout.click();
	}
	public void verifyLogout() {
		String current_url = getDriver().getCurrentUrl();
		Assert.assertTrue(current_url.contains("logout"));
	}
}
