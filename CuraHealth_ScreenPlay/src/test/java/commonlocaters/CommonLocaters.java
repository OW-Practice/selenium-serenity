package commonlocaters;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CommonLocaters {
	
	public static final By fldUsername=By.cssSelector("[placeholder=\"Username\"]:nth-child(1)");
	public static By fldPassword=By.cssSelector("[type=\"password\"]:nth-child(1)");
	public static By btnLogin=By.xpath("//button[@id='btn-login']");
	public static By txtAppointment=By.xpath("//h2[text()='Make Appointment']");
	
	public static By facilityDropdown=By.cssSelector("[name=\"facility\"]");
	public static By dropdownValue=By.cssSelector("[value=\"Tokyo CURA Healthcare Center\"]");
	public static By readmissionCheckbox=By.xpath("//input[@name=\"hospital_readmission\"]");
	public static By selectDateField=By.cssSelector("[name=\"visit_date\"]");
	public static By textComment=By.cssSelector("[name=\"comment\"]");
	public static By btnBookAppointment=By.xpath("//button[@id=\"btn-book-appointment\"]");
	public static By appointmentConfirmation=By.xpath("//*[text()='Appointment Confirmation']");
	public static By selectedFecility=By.xpath("//*[text()='Tokyo CURA Healthcare Center']");
	public static By btnGoToHome=By.xpath("//a[@class=\"btn btn-default\"]/..//*[text()='Go to Homepage']");
	public static By tabHistory=By.xpath("//a[text()='History']");
	public static By headerHistory=By.xpath("//*[text()='History']/parent::div");
	public static By tabProfile=By.xpath("//a[text()='Profile']");
	public static By profileText=By.xpath("//h2[text()='Profile']");
	public static By btnLogout =By.xpath("//a[text()='Logout']/parent::p");
	public static By selectDate=By.xpath("//*[@class=\"datepicker-days\"]//td[text()='${text}']");
	public static By underdev=By.xpath("//*[text()='Under construction.']/parent::div");
	
}
