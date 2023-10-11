package Locators;

import org.openqa.selenium.By;

public class ContactsPage {
	
public static By addContactButton=By.cssSelector("[id='contact.add']");
public static By createContact=By.xpath("//*[text()='Create contact']");
public static By contactPopup=By.xpath("//*[normalize-space(text())='Create Contact']");
public static By firstname=By.cssSelector("#firstname");
public static By lastname=By.cssSelector("#lastname");
public static By email=By.cssSelector("#email");
public static By saveButton=By.xpath("//*[text()='Save']");
}
