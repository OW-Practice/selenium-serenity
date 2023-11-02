package locaters;

import org.openqa.selenium.By;

public class ProductsLocaters {
	
	public static By backPackBag=By.xpath("//*[text()='Sauce Labs Backpack']");
	public static By backPackDesc=By.xpath("//div[contains(text(),'carry.allTheThings() with the sleek')]");
	public static By addBagButton=By.cssSelector("[name=\"add-to-cart-sauce-labs-backpack\"]");
	public static By pageBackIcon=By.cssSelector("[name=\"back-to-products\"]");
	public static By sortFilter=By.cssSelector("[class=\"product_sort_container\"]");
	public static By lowTohighFilter=By.xpath("//*[text()='Price (low to high)']");
	public static By addBikeLight=By.cssSelector("[name=\"add-to-cart-sauce-labs-bike-light\"]");
	public static By hightTolowFilter=By.xpath("//*[text()='Price (high to low)']");
	public static By priceHigh=By.xpath("//div[text()='49.99']");
	public static By priceLow=By.xpath("//div[text()='29.99']");
	public static By addRedTshirt=By.cssSelector("[name=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	public static By removeRedTshirt=By.cssSelector("name=\"remove-test.allthethings()-t-shirt-(red)\"");
    public static By removeButton=By.xpath("//*[text()='Remove']");
    public static By lowestprice=By.xpath("//div[text()='9.99']");
}
