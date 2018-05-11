package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class FinalCheckout extends Lib{

	public static void totalPrice(WebDriver driver) throws IOException {
		WebElement total = findElem(driver, readProperty("finalTotal"));
		System.out.print(total.getText() + " ");
		WebElement price = findElem(driver, readProperty("finalPrice"));
		System.out.println(price.getText());
		takeScreenshot(driver, "01");
	}
}
