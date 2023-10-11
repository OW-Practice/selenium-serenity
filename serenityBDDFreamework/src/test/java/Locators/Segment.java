package Locators;

import org.openqa.selenium.By;

public class Segment {
	public static By createSegmentButton=By.cssSelector("[id='segments.new']");
	public static By createSegmentPage=By.xpath("//*[contains(@class,'breadcrumbs ')]//*[normalize-space(text())='Create']");
	public static By nameField=By.cssSelector("[id='name']");
	public static By descriptionField=By.cssSelector("[id='description']");
	public static By createButton=By.cssSelector("[id=create-a-segment-create']");
}
