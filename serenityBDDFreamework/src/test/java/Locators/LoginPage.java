package Locators;

import org.openqa.selenium.By;

public class LoginPage {
public static By username = By.cssSelector("[id='email']");
public static By finlinkUsername = By.cssSelector("[tabindex='1']");
public static By proceedButton = By.cssSelector("[type='button']");
public static By finlinkPassword = By.cssSelector("[type='password']");
public static By password = By.cssSelector("[id='password']");
public static By submitButton = By.cssSelector(("[type='button']"));
public static By loginButton = By.cssSelector(("[class*='btn-lg btn']"));

}
