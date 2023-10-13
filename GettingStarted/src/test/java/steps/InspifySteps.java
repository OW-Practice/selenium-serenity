package steps;

import net.thucydides.core.annotations.Step;
import pages.InspifyPage;
import pages.LoginPage;
import pages.ScreenPlay;

public class InspifySteps {
	LoginPage login;
	InspifyPage inspify;

	@Step
	public void launchURL() {
//		ChromeOptions options = new ChromeOptions();
//
//		Map<String, Object> prefs = new HashMap<>();
//		prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
//		prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
//		prefs.put("profile.default_content_setting_values.notifications", 1);
//		options.setExperimentalOption("prefs", prefs);
//		LoggingPreferences logPrefs = new LoggingPreferences();
//		logPrefs.enable(LogType.BROWSER, Level.ALL);
//		options.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
//		options.addArguments("--allow-file-access-from-files", "--allow-file-access");
		login.open();
	}

	@Step
	public void login(String username, String password) {
		login.login(username, password);
	}

	@Step
	public void goToProfile() {
		inspify.goToProfile();
	}

	@Step
	public void verifyLogin() {
		inspify.verifyLogin();
	}

	@Step
	public void logout() {
		inspify.logout();
	}

	@Step

	public void verifyLogout() {
		inspify.verifyLogout();
	}

	@Step

	public void startLiveSession() throws InterruptedException {
		inspify.startLiveSession();
	}

	@Step

	public void acceptPermissions() {
		inspify.acceptPermissions();
	}

	@Step

	public void verifyIsLiveSessionLoungeDisplayed() throws InterruptedException {

		inspify.verifyIsLiveSessionLoungeDisplayed();
	}

	@Step

	public void startSession() throws InterruptedException {
		inspify.startLiveSession();
	}

	@Step
	public void verifyIsLiveSessionStarted() {
		inspify.verifyIsLiveSessionStarted();
	}

	@Step

	public void clickOnCreateButton() {
		inspify.clickOnCreateButton();
	}

	@Step
	public void CreateSession(String sessionTitle, String sessionDesc) {
		inspify.CreateSession(sessionTitle, sessionDesc);
	}

	@Step

	public void VerifyIsSessionCreated(String sessionTitle) {
		inspify.VerifyIsSessionCreated(sessionTitle);
	}

	@Step
	public void goToCalendar() throws InterruptedException {
		inspify.goToCalendar();
	}

	@Step
	public void goToStorybookMenu() {
		inspify.goToStorybook();
	}

	public void createSB(String sbTitle, String sbSubTitle, String filepath) throws InterruptedException {
		inspify.clickOnCreateSB();
		inspify.inputSBTitles(sbTitle, sbSubTitle);
		inspify.clickSave();
		inspify.uploadFile(filepath);
		inspify.selectUploadedFile();
		inspify.activateSB();
	}

	public void verifyIsSBCreated(String sbtitle, String sbsubtitle) {
		inspify.verifyIsSBCreated(sbtitle, sbsubtitle);
	}
}
