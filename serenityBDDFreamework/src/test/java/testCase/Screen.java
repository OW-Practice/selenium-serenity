package testCase;

import org.aspectj.apache.bcel.classfile.Module.Open;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;

public class Screen {
	
    @Managed
    private WebDriver driver;  // Serenity will manage the WebDriver instance

   // @Steps
   // private LoginSteps loginSteps;

    @Test
    public void user_can_launch_browser() {
        // Create an Actor (representing the user)
        Actor user = Actor.named("User");

        // The actor has the ability to browse the web
        user.can(BrowseTheWeb.with(driver));
        

        // The actor opens a web page
        user.attemptsTo();
        // Add any additional interactions and assertions as needed
    }
}
