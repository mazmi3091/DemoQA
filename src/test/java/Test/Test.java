package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ProductCheckout;
import Pages.FinalCheckout;
import Pages.Homepg;
import Pages.ProductPage;

public class Test {

	public static WebDriver driver;

	@BeforeClass
	public static void initialize() {
		driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver",
				"D:\\Google Drive\\PIIT\\Selenium\\Java\\DemoQA\\chromedriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@org.junit.Test
	public void testt() throws IOException, InterruptedException {
		Homepg.getTitle(driver);
		Homepg.category(driver);
		Homepg.clickIphone(driver);
		
		ProductPage.printHeader(driver);
		ProductPage.clickiphone4s(driver);
		ProductPage.addToCart(driver);
		ProductPage.checkoutButton(driver);
		
		ProductCheckout.getTotalPrice(driver);
		ProductCheckout.contCheckout(driver);
		
		FinalCheckout.totalPrice(driver);
	}
	
	@AfterClass
	public static void teadrown() {
		System.out.println("Testing is finished!!!@@@");
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
