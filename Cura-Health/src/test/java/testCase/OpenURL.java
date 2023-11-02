package testCase;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)
public class OpenURL {
    private final String url;

    public OpenURL(String url) {
        this.url = url;
    }
  
    public static OpenURL to(String url) {
        return new OpenURL(url);
    }
    @Managed(driver = "cheome")
  	WebDriver driver;
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
     //       Open.url();
        );
    }
}
