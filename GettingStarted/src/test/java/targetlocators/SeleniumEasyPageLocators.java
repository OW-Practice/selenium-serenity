package targetlocators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleniumEasyPageLocators extends PageObject {
	public static final Target INPUT_FORMS_LINK = Target.the("Input forms link")
			.locatedBy("//*[text()='Input Forms']");
	public static final Target SIMPLE_FORM_DEMO_LINK = Target.the("Single form demo link")
			.locatedBy("//ul[not(@class)]//li//a[contains(@href, 'basic-first-form')]");
	public static final Target ENTER_MESSAGE = Target.the("Enter message field").locatedBy("[aria-label='message']");
	public static final Target SHOW_MESSAGE = Target.the("Show message button")
			.locatedBy("//button[@onclick='showInput();']");
	public static final Target MESSAGE = Target.the("Show message button").locatedBy("[title='text message']");
}
