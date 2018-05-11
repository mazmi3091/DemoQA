package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.Lib;

public class ProductPage extends Lib {
	
	public static void getTitle(WebDriver driver) {
		title(driver);
	}
	
	public static void printHeader(WebDriver driver) throws IOException {
		WebElement header = findElem(driver, readProperty("productHeader"));
		System.out.println(header.getText());
	}
	
	public static void clickiphone4s(WebDriver driver) throws IOException, InterruptedException {
		WebElement iphone = findElem(driver, readProperty("iphone4s"));
		iphone.click();
		Thread.sleep(2000);
	}
	
	public static void addToCart(WebDriver driver) throws IOException, InterruptedException {
		WebElement cart = findElem(driver, readProperty("addToCart"));
		cart.click();
		Thread.sleep(2000);
	}
	
	public static void checkoutButton(WebDriver driver) throws IOException, InterruptedException {
		WebElement checkout = findElem(driver, readProperty("checkoutButton"));
		checkout.click();
		Thread.sleep(2000);
	}

}
