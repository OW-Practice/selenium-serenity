package pages;

import static java.time.temporal.ChronoUnit.SECONDS;

import baseclass.BasePage;
import locaters.LandingScreen;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class MakeAppointment extends PageObject {
	
	LandingScreen land;
	BasePage bp;
	
//	public void verifyMakeAppointentButton() {
//		setImplicitTimeout(30, SECONDS);
//		WebElementFacade makeappointment=$(land.btnBookAppointment);
//		makeappointment.isVisible();
//		
//		
//	}
//	public void bookstolt() {
//		setImplicitTimeout(30, SECONDS);
//		WebElementFacade makeappointment=$(land.btnBookAppointment);
//		makeappointment.waitUntilClickable().click();
//		
//	}
	public void patientLogin(String username,String password) {
		WebElementFacade menu=$(land.lftHamberg);
		menu.click();
		WebElementFacade logintab=$(land.tabLogin);
		logintab.click();
		setImplicitTimeout(40, SECONDS);
		WebElementFacade logiName=$(land.fldUsername);
		logiName.type(username);
		setImplicitTimeout(40, SECONDS);
		WebElementFacade loginPassword=$(land.fldPassword);
		loginPassword.type(password);
		setImplicitTimeout(60, SECONDS);
		
		WebElementFacade loginButton=$(land.btnLogin);
		loginButton.click();
		
	}
	public void verifyPatientDetailPage() {
		setImplicitTimeout(30, SECONDS);
		WebElementFacade appointmenttext=$(land.txtAppointment);
		appointmenttext.isVisible();
	}
	 
	
	  public void selectReadmissioncheckbox() {
	  setImplicitTimeout(30, SECONDS);
	  WebElementFacade checkbox=$(land.readmissionCheckbox);
	  setCheckbox(checkbox,false);
	  }
	 
	public void selectVisitDate() {
		$(land.selectDateField).waitUntilClickable().click();
		setImplicitTimeout(30, SECONDS);
		WebElementFacade currentDate=$("//*[@class='datepicker-days']//td[text()='"+bp.getCurrentDate()+"']");
		currentDate.waitUntilClickable().click();
		
	}
	public void addComment(String comment) {
		WebElementFacade commentbox=$(land.textComment);
		commentbox.click();
		commentbox.type(comment);
	}
	public void clickOnBookButton() {
		setImplicitTimeout(30, SECONDS);
		WebElementFacade book=$(land.btnBookAppointment);
		book.waitUntilClickable();
		book.click();
	}
	public void verifytheBookedAppointment() {
		
		setImplicitTimeout(30, SECONDS);
		WebElementFacade confirm= $(land.appointmentConfirmation);
		confirm.isDisplayed();
		System.out.println(confirm.getText());
		
		
	}
	

}
