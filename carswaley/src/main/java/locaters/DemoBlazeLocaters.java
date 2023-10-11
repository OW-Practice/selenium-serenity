package locaters;

import org.openqa.selenium.By;

public class DemoBlazeLocaters {

	
	public static By logoBrand=By.cssSelector("[class=\"navbar-brand\"]");
	public static By txtSignup=By.id("signin2");
	public static By singUpPopup=By.id("[id=\"signInModalLabel\"]");
	public static By fieldUsername=By.xpath("//input[@id=\"sign-username\"]");
	public static By fieldPassword=By.xpath("//input[@id=\"sign-password\"]");
	public static By btnSignUp=By.cssSelector("[onclick=\"register()\"]");
	public static By txtLogin=By.xpath("//a[@id=\"login2\"]");
	public static By lgnPopup=By.id("id=\"logInModalLabel\"");
	public static By lgnUsername=By.xpath("//input[@id=\"loginusername\"]");
	public static By lgnPassword=By.xpath("//input[@id=\"loginpassword\"]");
	public static By btnLogin=By.cssSelector("[onclick=\"logIn()\"]");
	public static By lgnName=By.xpath("//a[@id=\"nameofuser\"]");
	public static By hdrCategories=By.cssSelector("[class=\"list-group-item\"]:nth-child(1)");
	public static By mobileprise=By.cssSelector("[class=\"price-container\"]");
	public static By btnAddToCart=By.cssSelector("[onclick=\"addToCart(1)\"]");
	public static By lninkAddToCart=By.xpath("//*[text()='Cart']");
	public static By mobile=By.xpath("//*[text()='Samsung galaxy s6']");
	public static By btnPlaceOrder=By.cssSelector("[class=\"btn btn-success\"]");
	public static By cstmrName=By.id("name");
	public static By cstmCardNumber=By.id("[id=\"card\"]");
	public static By cstmrCardMonth=By.id("[id=\"month\"]");
	public static By cstmrCardyear=By.id("[id=\"year\"]");
	public By btnPurchaseOrder=By.cssSelector("[onclick=\"purchaseOrder()\"]");
	public static By successPopup=By.xpath("//*[text()='Thank you for your purchase!']");
	public static By btnOk=By.xpath("//button[text()='OK']");
	public static By bfrBuyPrice=By.xpath("//*[text()='$360']");
	
}
