package base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {
	
	/******* Common Functionality ************/

	// Find Element
	public WebElementFacade getElement(String locator) {

		try {

			return find(getBy(locator));

		} catch (NoSuchElementException e) {

			e.getMessage();

		}

		return null;
	}

	// Finding Multiple Elements
	public List<WebElementFacade> getElements(String locator) {

		try {

			return findAll(getBy(locator));

		} catch (NoSuchElementException e) {

			e.getMessage();

		}

		return null;
	}

	private By getBy(String locator) {

		By by = null;

		try {

			if (locator.startsWith("id=")) {

				locator = locator.substring(3);
				by = By.id(locator);
			} else if (locator.startsWith("xpath=")) {

				locator = locator.substring(6);
				by = By.xpath(locator);
			} else if (locator.startsWith("css=")) {

				locator = locator.substring(4);
				by = By.cssSelector(locator);
			} else if (locator.startsWith("name=")) {

				locator = locator.substring(5);
				by = By.name(locator);
			} else if (locator.startsWith("link=")) {

				locator = locator.substring(5);
				by = By.linkText(locator);
			}
			return by;

		} catch (Throwable t) {

			t.getMessage();
		}

		return null;

	}

	public void click(String locator) {

		waitFor(getElement(locator)).click();
	}

	public void type(String locator, String value) {

		waitFor(getElement(locator)).sendKeys(value);
	}

	public String getText(String locator) {

		return waitFor(getElement(locator)).getText();
	}

	public void moveMouseTo(String locator) {

		WebElement moveTo = waitFor(getElement(locator));
		withAction().moveToElement(moveTo).perform();
	}

	/******* Business Specific common Functionality ********/

	String headingText = "xpath=/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/h1[1]";

	public String getCarPageHeading() {

		return getText(headingText);

	}

	String carBrandName = "xpath=//li//div[1]//div[1]//div[1]//a[1]//h2[1]";
	String carPrice = "xpath=//li/div[1]/div[1]/div[1]/div[1]/span[1]";

	public ArrayList<String> list = new ArrayList<String>();
	
	public void getCarNameAndPrice() {

		List<WebElementFacade> carNames = getElements(carBrandName);
		List<WebElementFacade> carprice = getElements(carPrice);

		for (int i = 0; i < carNames.size(); i++) {

			String text = carNames.get(i).getText() + "  price is :" + carprice.get(i).getText();
			list.add(text);
		}
		
		for(String l:list) {
			
			System.out.println(l);
		}

	}

	public void updateCarPriceInFile(String fileName) {

		String info = fileName + " car brand name and price\n";
		File file = new File(fileName);
		try {

			FileWriter fw = new FileWriter(file, true);

			// if you want to write the linesperator ("\n) as they are in the txt you should
			// use the following Code:

			fw.write(info);
			String lineSeparator = System.getProperty("line.separator");

			

			for (int i = 0; i < list.size(); i++) {
				fw.write(list.get(i));
				fw.write(lineSeparator);
			}

			fw.flush();
			fw.close();
			FileUtils.copyFile(file, new File(".//carprice//" + fileName + ".txt"));
			FileUtils.deleteQuietly(file);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
	
	public void elementPresence(String locator) {

		waitFor(getElement(locator)).shouldBePresent();

	}

	public void fileUpload(String locator, String filepath) {
		WebElementFacade fileInput = getElement(locator);
		File fileToUpload = new File(filepath);
		fileInput.sendKeys(fileToUpload.getAbsolutePath());
	}
	
	public void hoverOnElement(String locator) {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(getElement(locator)).perform();
	}
	
	public String getElementText(String locator) {
		String text = waitFor(getElement(locator)).getText();
		return text;
	}

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

	public void clickActionOnWebElement(By Locator){
	WebElementFacade clickOpr  = $(Locator);
	waitTimeforElementVisible(2000);
	clickOpr.isDisplayed();
	clickOpr.isClickable();
	clickOpr.click();
}

public void waitTimeforElementVisible(int i){
	try {
		Thread.sleep(i);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void typeIntoWebElement(By Locator,String value) {
	WebElementFacade SendKeysOpr  = $(Locator);
	waitTimeforElementVisible(2000);
	SendKeysOpr.isDisplayed();
	SendKeysOpr.clear();
	SendKeysOpr.type(value);
}

}
