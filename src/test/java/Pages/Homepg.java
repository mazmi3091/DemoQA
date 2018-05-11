package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Homepg extends Lib {
	
	public static void getTitle(WebDriver driver) {
		title(driver);
	}
	
	public static void category(WebDriver driver) throws IOException {
		WebElement cat = findElem(driver, readProperty("categoryButton"));
		Actions ac = new Actions(driver);
		ac.moveToElement(cat).build().perform();
	}
	
	public static void clickIphone(WebDriver driver) throws IOException, InterruptedException {
		WebElement iphone = findElem(driver, readProperty("iphone"));
		iphone.click();
		Thread.sleep(2000);
	}

}
