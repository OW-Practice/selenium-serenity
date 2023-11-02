package Locators;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static By username = By.cssSelector("[id='email']");
	public static By finlinkUsername = By.cssSelector("[tabindex='1']");
	public static By proceedButton = By.cssSelector("[type='button']");
	public static By finlinkPassword = By.cssSelector("[type='password']");
	public static By password = By.cssSelector("[id='password']");
	public static By submitButton = By.cssSelector(("[type='button']"));
	public static By loginButton = By.cssSelector(("[class*='btn-lg btn']"));
	public static Target errorMessage = Target.the("Login error message")
			.located(By.cssSelector("//*[text()='Bad credentials']"));
	public static Target continuesBtn = Target.the("continueBtn")
			.located(By.cssSelector("[id='login-submit']"));
	public static Target trelloUsername = Target.the("username").located(By.cssSelector("[id='username']"));
	public static Target nextButton = Target.the("username").located(By.cssSelector("[id='identifierNext']"));
	public static Target trelloPasswordField = Target.the("password").located(By.cssSelector("[id='password']"));
	public static Target trelloLoginBtn = Target.the("LoginBtn").located(By.cssSelector("[id='login-submit']"));
	public static Target trelloIcon = Target.the("trelloIcon")
			.located(By.cssSelector("[data-testid='start-product__TRELLO_TRELLO']"));
	public static Target createButton = Target.the("create").located(By.cssSelector("[aria-label*='Create board']"));
	public static Target createBoard = Target.the("createBoard")
			.located(By.cssSelector("[data-testid='header-create-board-button']"));
	public static Target boardTitleField = Target.the("createBoard")
			.located(By.cssSelector("[data-testid='create-board-title-input']"));
	public static Target create = Target.the("create")
			.located(By.cssSelector("[data-testid='create-board-submit-button']"));
	public static Target listTitle = Target.the("cardName").located(By.cssSelector("[name*='Enter list title']"));
	public static Target addList = Target.the("addList")
			.located(By.cssSelector("[data-testid='list-composer-add-list-button']"));
	public static Target loginBtn = Target.the("loginbtn")
			.located(By.cssSelector("[data-uuid*='login']"));
	
	

}
