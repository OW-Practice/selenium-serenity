package targetlocators;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleniumEasyPageLocators extends PageObject {
	public static final Target INPUT_FORMS_LINK = Target.the("Input forms link").locatedBy("//*[text()='Input Forms']");
	public static final Target SIMPLE_FORM_DEMO_LINK = Target.the("Single form demo link")
			.locatedBy("//ul[not(@class)]//li//a[contains(@href, 'basic-first-form')]");
	public static final Target ENTER_MESSAGE = Target.the("Enter message field").locatedBy("[aria-label='message']");
	public static final Target SHOW_MESSAGE = Target.the("Show message button")
			.locatedBy("//button[@onclick='showInput();']");
	public static final Target MESSAGE = Target.the("Show message button").locatedBy("[title='text message']");
	public static final Target ALERTS_AND_MODALS_LINK = Target.the("Alerts and Modals link")
			.locatedBy("//*[text()='Alerts & Modals']");
	public static final Target JAVASCRIPT_ALERT_LINK = Target.the("Javascript alert link")
			.locatedBy("//ul[not(@class)]//li//a[contains(@href, 'javascript-alert-box')]");
	public static final Target ClickMe_Button = Target.the("Single form demo link")
			.locatedBy("[onclick='myAlertFunction()']");
	public static final Target EnterValueA = Target.the("a value").locatedBy("#value1");
	public static final Target EnterValueB = Target.the("b value").locatedBy("#value2");
	public static final Target GetTotalButton = Target.the("Get total").locatedBy("[onclick='return total()']");
	public static final Target SumText = Target.the("Get total").locatedBy("#displayvalue");

}
