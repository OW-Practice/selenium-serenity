package Locators;

import org.openqa.selenium.By;

public class AppointmentPage {
	public static By appointmentPage = By.cssSelector(("[class='container']  h2"));
	public static By facilityDropdown = By.cssSelector(("[name='facility']"));
	public static By selectFacilityType = By.cssSelector(("[value='Seoul CURA Healthcare Center']"));
	public static By applyForHospitalReadmission = By.cssSelector(("[class='checkbox-inline']"));
	public static By none = By.cssSelector(("[id='radio_program_none']"));
	public static By visitDate = By.cssSelector(("[id='txt_visit_date']"));
	public static By commentBox = By.cssSelector(("#txt_comment"));
	public static By bookApppoinrmnet = By.cssSelector(("[class='btn btn-default']"));



}
