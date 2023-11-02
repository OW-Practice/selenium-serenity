package Locators;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static By title = By.xpath("//h1[text()='CURA Healthcare Service']");
	public static By username = By.cssSelector("[name='username']");
	public static By password = By.cssSelector("[id='txt-password']");
	public static By loginButton = By.cssSelector(("[id='btn-login']"));

	
	
	

}
