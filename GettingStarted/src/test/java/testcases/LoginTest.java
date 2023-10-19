package testcases;

import org.junit.Test;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {
	@Managed
	WebDriver driver;
	
	@Title("Executing Login Test")
	@Test
	public void doLogin() {
		// driver.get("https://nikhilp-prod3.inspify.com/hub");
		open();
		System.out.println(getTitle());
		// driver.findElement(By.id("username")).sendKeys("nikhilp@inspify.com");
		// getDriver().findElement(By.id("username")).sendKeys("nikhilp@inspify.com");
		// find(By.id("username")).sendKeys("nikhilp@inspify.com");
		WebElementFacade usernameField = find(By.id("username"));
		usernameField.shouldBePresent();
		find(By.id("username")).sendKeys("nikhilp@inspify.com");
		// find(By.id("password")).sendKeys("Nikhilp@123");
		typeInto(find(By.id("password")), "nikhilp@inspify.com");
		// find(By.xpath("//button[text()='SIGN IN']")).click();
		$("//button[text()='SIGN IN']").click();	
	}
	
	@Test
	public void waits() {
		// driver.get("https://nikhilp-prod3.inspify.com/hub");
		open();
		System.out.println(getImplicitWaitTimeout());
		System.out.println(getWaitForTimeout());
		//setImplicitTimeout(5, SECONDS);
		find(By.id("username")).sendKeys("nikhilp+prod3@inspify.com");
		typeInto(find(By.id("password")), "Nikhilp@123");
		WebElementFacade calendar = find(By.xpath("//*[text()='CALENDAR']"));
		withTimeoutOf(Duration.ofSeconds(10)).find(By.xpath("//button[text()='SIGN IN']")).click();
		calendar.shouldBeVisible();
		//waitForCondition().until(ExpectedConditions.elementToBeClickable(By.cssSelector(".start-session-btn"))).click();
		waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).withMessage("Waited for 10 seconds, but no luck").until(ExpectedConditions.elementToBeClickable(By.cssSelector(".start-session-btn"))).click();
	}
}
