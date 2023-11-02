package ScreenplayPages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.awt.dnd.DragSourceDragEvent;

import org.assertj.core.error.ShouldBeEqual;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Locators.LoginPage;
//6import ScreenplayActions.LoginActionWithCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.WithChainableActions;
import net.serenitybdd.screenplay.ensure.Ensure;


public class LoginWithCredentials extends PageObject {

/*public class LoginWithCredentials implements Interaction {

	private final String username;
	private final String password;

	public LoginWithCredentials(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public static Performable Page1(String username, String password) {
		return new LoginWithCredentials(username, password);
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(username).into(LoginPage.finlinkUsername),
				Enter.theValue(password).into(LoginPage.finlinkPassword), Click.on(LoginPage.loginButton));

	}

	public <T extends Actor> void verifyHomePage(T actor) {
		actor.attemptsTo(

		// Ensure.that(name).isEqualToIgnoringCase("BILL").into()

		);
	}

	public static Performable invalidCreds(String username, String password) {
		return Task.where("{0} logs in with invalid credentials", Ensure.that(LoginPage.finlinkUsername).isDisplayed(),
				Enter.theValue(username).into(LoginPage.finlinkUsername),
				Enter.theValue(password).into(LoginPage.finlinkPassword), Click.on(LoginPage.loginButton),
				Ensure.that(LoginPage.errorMessage).isDisplayed());
	}
	/*public static Performable clickOnLoginButton() {
		return Task.where("{0} click on google", Click.on(LoginPage.loginWithGoogle)

		);
	}*/
	public static Performable clickOnContinueBtn() {
		return Task.where("{0} click on continue", Click.on(LoginPage.continuesBtn)

		);

	}

	public static Performable enterUsername(String username) {
		return Task.where("{0} enter username", Enter.theValue(username).into(LoginPage.trelloUsername));
	}

	public static Performable clickOnNextButton() {
		return Task.where("{0} click on next button", Click.on(LoginPage.nextButton)

		);

	}

	public static Performable enterPassword(String password) {
		return Task.where("{0} enter password", Enter.theValue(password).into(LoginPage.trelloPasswordField));
	}
	public static Performable clickOnLogBtn() {
		return Task.where("{0} select trello", Click.on(LoginPage.loginBtn)

		);

	}

	public static Performable selectTrelloOption() {
		return Task.where("{0} select trello", Click.on(LoginPage.trelloIcon)

		);

	}

	public static Performable clickOnCreateMenu() {
		return Task.where("{0} create menu", Ensure.that(LoginPage.createButton).isDisplayed(),
				Click.on(LoginPage.createButton)

		);

	}

	public static Performable selectCreateBoard() {
		return Task.where("{0} select createBoard", Ensure.that(LoginPage.createBoard).isDisplayed(),
				Click.on(LoginPage.createBoard)

		);

	}

	public static Performable enterBoardTitle(String boardTitle) {
		return Task.where("{0} enter board title", Enter.theValue(boardTitle).into(LoginPage.boardTitleField));
	}

	public static Performable clickCreateButton() {
		return Task.where("{0} create button", Ensure.that(LoginPage.create).isEnabled(), Click.on(LoginPage.create)

		);

	}

	public static Performable enterListTitle(String listTitle) {
		return Task.where("{0} card name", Enter.theValue(listTitle).into(LoginPage.listTitle));
	}

	public static Performable clickOnaddListButton() {
		return Task.where("{0} add list", Click.on(LoginPage.addList)

		);

	}
	
	public static Performable clickOnLoginLink() {
		return Task.where("{0} login link ", Click.on(LoginPage.loginBtn)

		);
	}
	public static Performable clickLoginBtn() {
		return Task.where("{0} login button", Click.on(LoginPage.trelloLoginBtn)

		);
	}
	
	public static void dragAndDrop() {
		
	}
	
	
}

