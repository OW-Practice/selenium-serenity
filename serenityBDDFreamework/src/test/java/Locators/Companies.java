package Locators;

import org.openqa.selenium.By;

public class Companies {
	public static By createNewButton=By.cssSelector("[id='companies.create']");
	public static By createCompanyPopup=By.xpath("//*[normalize-space(text())='Create Company']");
	public static By nameField=By.cssSelector("#name");
	public static By street=By.cssSelector("#street");
	public static By streetNumber=By.cssSelector("#street_number");
	public static By city=By.cssSelector("#city");
	public static By state=By.cssSelector("#state");
	public static By postCode=By.cssSelector("#post_code");
	public static By saveButton=By.cssSelector("[data-cy='modal-save-button']");
}
