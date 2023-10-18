package testCase;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.LoginPageSteps;
import Steps.LogoutTest;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import pages.DashboardPage;
import utilities.ExcelReader;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent(threads="4")
public class LoginWithExcelTestSuite extends PageObject {
	private String username;
	private String password;
	
	
	
	public LoginWithExcelTestSuite(String username,String password) {
		this.username=username;
		this.password=password;
	}
	@TestData
	public static Collection<Object[]> excel() {
		ExcelReader excelSheet=new ExcelReader("src//test//resources//TestDataExcel//ExcelData.xlsx");
		String sheetName="Sheet1";
		int rows=excelSheet.getRowCount(sheetName);
		int column=excelSheet.getColumnCount(sheetName);
		System.out.println("rows are="+rows+"columns are="+column);
		System.out.println(excelSheet.getCellData(sheetName, 0, 2));
		Object[][] excelData=new Object[rows-1][2];
		excelData[0][0]=excelSheet.getCellData(sheetName, 0, 2);
		excelData[0][1]=excelSheet.getCellData(sheetName, 1, 2);
		excelData[1][0]=excelSheet.getCellData(sheetName, 0, 3);
		excelData[1][1]=excelSheet.getCellData(sheetName, 1, 3);
		//excelData[2][0]=excelSheet.getCellData(sheetName, 0, 4);
		//excelData[2][1]=excelSheet.getCellData(sheetName, 1, 4);
		//excelData[3][0]=excelSheet.getCellData(sheetName, 0, 5);
		//excelData[3][1]=excelSheet.getCellData(sheetName, 1, 5);
		//excelData[4][0]=excelSheet.getCellData(sheetName, 0, 6);
		//excelData[4][1]=excelSheet.getCellData(sheetName, 1, 6);




		return Arrays.asList(excelData);

}
	@Managed(driver = "firefox")
	WebDriver driver;
	@Steps
	LoginPageSteps login;
	DashboardPage dashboard;
	LogoutTest logout;
	TestData data;	
	@Test
	public void login() {
		//driver.get("https://app.emlen-staging.io/login");
		open();
		login.verifyLoginPageIsDisplayed();
		login.enterUsername(username);
		//login.clickProceedButton();
		login.verifyPasswordFiledDisplayed();
		login.enterPassword(password);
		login.clickonSubmitButton();
		dashboard.verifyDashboardPageDisplayed();
}
}
