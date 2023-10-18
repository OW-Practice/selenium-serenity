package testCase;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import pages.ScreenLoc;
import testDataDriven.TestData;

@RunWith(SerenityRunner.class)
public class ScreenTestSuite{
    @Managed(driver="chrome")
    WebDriver driver;
    TestData data;
   
    Actor user = new Actor("user");
 private static Target usernameField=Target.the("usernameField").located(By.cssSelector("[tabindex='1']"));
 private static Target proceedButton=Target.the("proceedButton").located(By.cssSelector("[type='button']"));
 private static Target passwordField=Target.the("passwordField").located(By.cssSelector("[type='password']"));
 private static Target loginButton=Target.the("sub,itButton").located(By.cssSelector("[class*='btn-lg btn']"));
  
 @Test
 public <T extends Actor> void userCanLoginSuccessfully() {
 
 
 user.can(BrowseTheWeb.with(driver));
 user.attemptsTo(Open.url("https://admin.finlink-staging.de/login"));
 user.attemptsTo(SendKeys.of(data.finlinkUsername).into(usernameField));
 //user.attemptsTo(Click.on(proceedButton));
 user.attemptsTo(SendKeys.of(data.finlinkPassword).into(passwordField));
 user.attemptsTo(Click.on(loginButton));
 //Enter.theValue(null)
 }
    
}
