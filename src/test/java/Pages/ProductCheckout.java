package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class ProductCheckout extends Lib {
	
	public static void getTotalPrice(WebDriver driver) throws IOException {
		WebElement total = findElem(driver, readProperty("total"));
		System.out.print(total.getText() + " ");
		WebElement price = findElem(driver, readProperty("price"));
		System.out.println(price.getText());
	}
	
	public static void contCheckout(WebDriver driver) throws IOException, InterruptedException {
		WebElement contCheck = findElem(driver, readProperty("continueCheckout"));
		contCheck.click();
		Thread.sleep(1000);
	}
	
	

}
