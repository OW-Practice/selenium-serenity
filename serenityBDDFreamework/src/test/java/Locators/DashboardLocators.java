package Locators;

import org.openqa.selenium.By;

public class DashboardLocators {
	public static By peopleDropdown= By.xpath("//*[text()='People']");
	public static By contactOption= By.cssSelector(".q-list [href='/contacts']");
	public static By segmentOption=By.cssSelector(".q-list [href='/segments']");
	public static By companies=By.cssSelector(".q-list [href='/companies']");
}
