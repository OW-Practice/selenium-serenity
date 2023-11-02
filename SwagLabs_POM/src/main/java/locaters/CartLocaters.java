package locaters;

import org.openqa.selenium.By;

public class CartLocaters {
	
	public static By CartIcon=By.xpath("//a[@class=\"shopping_cart_link\"]");
	public static By textYourCart=By.xpath("//*[text()='Your Cart']");
	public static By removeRed=By.cssSelector("[name=\"remove-test.allthethings()-t-shirt-(red)\"]");
	public static By btnCheckout =By.cssSelector("[name=\"checkout\"]");
	public static By txtcartinformation=By.xpath("//*[text()='Checkout: Your Information']");
	public static By fldFirstName=By.cssSelector("[name=\"firstName\"]");
    public static By fldLastName=By.cssSelector("[name=\"lastName\"]");
    public static By fldPincode=By.cssSelector("[name=\"postalCode\"]");
	public static By btnContinue=By.cssSelector("[name=\"continue\"]");
	public static By txtCheckoutoverview=By.xpath("//*[text()='Checkout: Overview']");
	public static By txtPaymentInformation=By.xpath("//*[text()='Payment Information']");
	public static By txtShippingInformation=By.xpath("//*[text()='Payment Information']");
	public static By btnFinish=By.cssSelector("[name=\"finish\"]");
	public static By txtComplete=By.xpath("//*[text()='Checkout: Complete!']");
	public static By txtConfirmation=By.xpath("//*[text()='Thank you for your order!']");
	public static By btnBackToHome=By.cssSelector("[name=\"back-to-products\"]");

}
