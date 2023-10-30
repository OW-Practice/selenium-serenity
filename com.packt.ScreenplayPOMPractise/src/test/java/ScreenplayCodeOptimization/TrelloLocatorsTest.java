package ScreenplayCodeOptimization;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class TrelloLocatorsTest {


	static Target launchLoginButton 										= Target.the("launchPageLoginButton").locatedBy("(//a[text()='Log in'])[1]");
	static Target userName 												= Target.the("userNamefield").locatedBy("[name='username']");
	static Target confirmUsername 										= Target.the("confirmUsernamebutton").locatedBy("#login-submit");
	static Target password 												= Target.the("passwordfield").locatedBy("#password");
	static Target submitLoginButton 									= Target.the("submitLoginButton").locatedBy("#login-submit");
	static Target createButton 											= Target.the("createButton").locatedBy("[data-testid='header-create-menu-button']");
	static Target createBoardButton 									= Target.the("createBoardButtoninHomepage").locatedBy("[data-testid='header-create-board-button']");
	static Target boardTitleField 										= Target.the("boardTitleField").locatedBy("[data-testid='create-board-title-input']");
	static Target submitBoardTitle 										= Target.the("submitBoardTitleButton").locatedBy("[data-testid='create-board-submit-button']");
	static Target homescreenLogoutOption 								= Target.the("homescreenprofileButton").locatedBy("//button[@data-testid='header-member-menu-button']");
	static Target logoutButton 											= Target.the("UnderprofilelogoutButton").locatedBy("//button[@data-testid='account-menu-logout']");
//	static Target submitlogoutButton 									= Target.the("UnderprofilelogoutButton").locatedBy("//button[@data-testid='account-menu-logout']");
	static Target NEWLY_CREATED_BOARD_ITEM_XPATH_IN_BOARDS_HOME_PAGE 	=Target.the("NEWLY_CREATED_BOARD_ITEM_XPATH_IN_BOARDS_HOME_PAGE").locatedBy("//div[@class='board-tile-details is-badged']");
//	static Target By IN_BOARDPAGE_CLICKING_ARCHIVELIST1 					= By.xpath("//a[@aria-label='List actions']");
//	static Target By IN_BOARDPAGE_CLICKING_ARCHIVETHELIST1 					= By.xpath("//a[text()='Archive this list']");
//	static Target By IN_BOARDPAGE_CLICKING_ARCHIVELIST2 					= By.xpath("//div[@class='list-header-extras']");
//	static Target By IN_BOARDPAGE_CLICKING_ARCHIVETHELIST2 					= By.xpath("//a[@class='js-close-list']");
//	static Target By IN_BOARDPAGE_CLICKING_ARCHIVELIST3 					= By.xpath("//a[@aria-label='List actions']");
	//  static Target By IN_BOARDPAGE_CLICKING_ARCHIVELIST3 =By.xpath("//a[@class='list-header-extras-menu dark-hover js-open-list-menu icon-sm icon-overflow-menu-horizontal']");
//	static Target By IN_BOARDPAGE_CLICKING_ARCHIVETHELIST3 					= By.xpath("//a[text()='Archive this list']");
	static Target ADD_A_LIST_ITEM_XPATH 									=Target.the("ADD_A_LIST_ITEM_XPATH").locatedBy("//span[text()='Add a list']");
	static Target LIST_TITLE_NAME_XPATH 									=Target.the("LIST_TITLE_NAME_XPATH").locatedBy("//textarea[@name='Enter list title…']");
	static Target ADD_LIST_BUTTON_XPATH 									=Target.the("ADD_LIST_BUTTON_XPATH").locatedBy("//button[@data-testid='list-composer-add-list-button']");
	static Target ENTER_TITLE_IN_CARD_FIELD_XPATH 						=Target.the("ENTER_TITLE_IN_CARD_FIELD_XPATH").locatedBy("//textarea[@class='list-card-composer-textarea js-card-title']");
	static Target ADD_CARD_BUTTON_XPATH									=Target.the("ADD_CARD_BUTTON_XPATH").locatedBy("//input[@value='Add card']");
	static Target ADD_A_CARD_ITEM_XPATH 								=Target.the(" ADD_A_CARD_ITEM_XPATH ").locatedBy("//a[@class='open-card-composer js-open-card-composer']");

}
