package locaters;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class swagLocaters {

	public static final Target swagHeader = Target.the("swag header").located(By.cssSelector("[class=\"login_logo\"]"));
	public static final Target userNameField = Target.the("username field").located(By.cssSelector("[name=\"user-name\"]"));
	public static final Target passwordField = Target.the("password field").located(By.cssSelector("[name=\"password\"]"));
	public static final Target buttonLogin = Target.the("login button").located(By.cssSelector("[name=\"login-button\"]"));
	public static final Target productsHeader = Target.the("product header").located(By.cssSelector("[class=\"title\"]"));


	
}
