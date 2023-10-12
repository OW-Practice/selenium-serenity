package pages;

import base.BasePage;
import org.junit.Assert;

public class InspifyPage extends BasePage {

	String ProfileMenu = "css=.btn-profile";
	String LogoutMenu = "css=.btn-logout";
	String AvatarSymbol = "css=.user-avatar";
	String Menu = "css=.menu-nav";
	String LoginForm = "css=.LoginForm";
	String WelcomeText = "xpath=//*[text()='WELCOME']";
	String StartLiveSessionButton1 = "xpath=//button[text()='Start Live Session']";
	String StartLiveSessionButton2 = "xpath=//b[text()='Start Live Session']";
	String PopupTitle = "css=[class*='title-popup']";
	String HostMessage = "css=[class$='host-info']";
	String Logo = "css=[class$='logo']";
	String LoungeVideo = "css=.lounge-local-video";
	String InputName = "css=[placeholder='Enter your name']";
	String StartSession = "css=#startMeeting";
	String SessionVideo = "css=[class$='local-video']";
	String LogoSection = "css=[class*='logo-section']";
	String MeetingControls = "css=[class*='meeting-controls show']";
	String CreateButton = "css=.create-btn";
	String SessionTopic = "css=[name='topic']";
	String SessionDesc = "css=textarea[name='description']";
	String SaveButton = "xpath=//button[text()='Save']";
	String CalendarMenu = "css=.btn-session";
	String SBMenu = "css=.btn-hub-storybook";
	String MySBTitle = "css=[title='My Storybooks']";
	String CreateSBButton = "css=.btn-create";
	String SBTitePopup = "css=.text-center";
	String SBTitle = "css=[placeholder='Please enter Storybook Title']";
	String SBSubTitle = "css=[placeholder='Please enter Storybook Subtitle']";
	String SBBuilderText = "xpath=//*[text()='Storybook Builder']";
	String UploadFile = "css=.upload-container .dropzone input";
	String ActivateButton1 = "css=span .btn-publish";
	String ActivateButton2 = "css=.btn-cancel+.btn-publish";
	String UploadButton = "css=.save-btn";
	String Select = "xpath=//button[text()='Select']";
	String Scene = "xpath=//div[contains(@class, 'actions')]";
	String SBTitleText = "css=.title strong";
	String SBSubTitleText = "css=.subtitle";

	public void goToProfile() {
		click(Menu);
		click(ProfileMenu);
	}

	public void verifyLogin() {
		elementPresence(AvatarSymbol);
	}

	public void logout() {
		click(Menu);
		click(LogoutMenu);
	}

	public void verifyLogout() {
		elementPresence(LoginForm);
		elementPresence(WelcomeText);
	}

	public void startLiveSession() throws InterruptedException {

		click(StartLiveSessionButton1);
		Thread.sleep(5000);
		elementPresence(PopupTitle);
		Thread.sleep(5000);
		click(StartLiveSessionButton2);
		Thread.sleep(5000);
	}

	public void verifyIsLiveSessionLoungeDisplayed() throws InterruptedException {
		elementPresence(Logo);
		elementPresence(HostMessage);
		elementPresence(LoungeVideo);
	}

	public void startSession() {
		elementPresence(InputName);
		type(InputName, "Host");
		click(StartSession);
	}

	public void verifyIsLiveSessionStarted() {
		elementPresence(LogoSection);
		elementPresence(SessionVideo);
		elementPresence(MeetingControls);
	}

	public void clickOnCreateButton() {
		click(CreateButton);
	}

	public void CreateSession(String sessionTitle, String sessionDesc) {
		type(SessionTopic, sessionTitle);
		type(SessionDesc, sessionDesc);
		click(SaveButton);
	}

	public void VerifyIsSessionCreated(String sessionTitle) {
		String SessionTitle = "xpath=//div[contains(text(), '" + sessionTitle + "')]";
		elementPresence(SessionTitle);
	}

	public void goToCalendar() {
		click(Menu);
		click(CalendarMenu);
	}

	public void acceptPermissions() {
		java.util.Set<String> windowHandles = getDriver().getWindowHandles();
		String sideWindowHandle = windowHandles.stream().filter(handle -> !handle.equals(getDriver().getWindowHandle()))
				.findFirst().orElseThrow(() -> new RuntimeException("Side window not found"));
		getDriver().switchTo().window(sideWindowHandle);
		elementPresence(Logo);
		elementPresence(HostMessage);
		elementPresence(LoungeVideo);
	}

	public void goToStorybook() {
		click(Menu);
		click(SBMenu);
		elementPresence(MySBTitle);
	}

	public void clickOnCreateSB() {
		click(CreateSBButton);
		elementPresence(SBTitePopup);
	}

	public void inputSBTitles(String sbTitle, String sbSubTitle) {
		type(SBTitle, sbTitle);
		type(SBSubTitle, sbSubTitle);
	}

	public void clickSave() {
		click(SaveButton);
		elementPresence(SBBuilderText);
	}

	public void uploadFile(String filepath) throws InterruptedException {
		fileUpload(UploadFile, filepath);
		click(UploadButton);
		Thread.sleep(5000);
	}

	public void selectUploadedFile() {
		hoverOnElement(Scene);
		click(Select);
	}

	public void activateSB() throws InterruptedException {
		click(ActivateButton1);
		click(ActivateButton2);
		Thread.sleep(5000);
	}

	public void verifyIsSBCreated(String sbtitle, String sbsubtitle) {
		String sbTitle = getElementText(SBTitleText);
		String sbSubTitle = getElementText(SBSubTitleText);
		System.out.println(sbTitle);
		System.out.println(sbSubTitle);
		Assert.assertEquals(sbTitle, sbtitle);
		Assert.assertEquals(sbSubTitle, sbsubtitle);
	}
}
