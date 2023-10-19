package locaters;

import org.openqa.selenium.By;

//import net.serenitybdd.screenplay.targets.Target;

public class DemoBlazeLocaters {
//	static Target CLICK_ON_HOMEPAGE_LOGIN_BUTTON =Target.the("homepageLoginButton").located(By.xpath("//a[@id='login2']"));

	
	public static By brandLogo=By.cssSelector("[class=\"navbar-brand\"]");
	public static By signupButton=By.id("signin2");
	public static By singupPopup=By.id("[id=\"signInModalLabel\"]");
	public static By fieldUsername=By.xpath("//input[@id=\"sign-username\"]");
	public static By fieldPassword=By.xpath("//input[@id=\"sign-password\"]");
	public static By buttonSignUp=By.cssSelector("[onclick=\"register()\"]");
	public static By loginButton=By.xpath("//a[@id=\"login2\"]");
	public static By lgnPopup=By.id("id=\"logInModalLabel\"");
	public static By lgnUsername=By.xpath("//input[@id=\"loginusername\"]");
	public static By lgnPassword=By.xpath("//input[@id=\"loginpassword\"]");
	public static By buttonLogin=By.cssSelector("[onclick=\"logIn()\"]");
	public static By loginName=By.xpath("//a[@id=\"nameofuser\"]");
	public static By item=By.cssSelector("[class=\"list-group-item\"]:nth-child(1)");
	public static By mobileprise=By.cssSelector("[class=\"price-container\"]");
	public static By btnAddToCart=By.cssSelector("[onclick=\"addToCart(1)\"]");
	public static By lninkAddToCart=By.xpath("//*[text()='Cart']");
	public static By mobile=By.xpath("//*[text()='Samsung galaxy s6']");
	public static By btnPlaceOrder=By.cssSelector("[class=\"btn btn-success\"]");
	public static By cstmrName=By.id("name");
	public static By cstmCardNumber=By.id("[id=\"card\"]");
	public static By cstmrCardMonth=By.id("[id=\"month\"]");
	public static By cstmrCardyear=By.id("[id=\"year\"]");
	public static By btnPurchaseOrder=By.cssSelector("[onclick=\"purchaseOrder()\"]");
	public static By successPopup=By.xpath("//*[text()='Thank you for your purchase!']");
	public static By btnOk=By.xpath("//button[text()='OK']");
	public static By bfrBuyPrice=By.xpath("//*[text()='$360']");
	
	
}
