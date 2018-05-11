package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	public static String title(WebDriver driver) {
		String value = driver.getTitle();
		return value;
	}

	public static WebElement findElem(WebDriver driver, String xpath) {
		WebElement el = driver.findElement(By.xpath(xpath));
		return el;
	}

	public static String readProperty(String key) throws IOException {
		File file = new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\DemoQA\\locator.property");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;

	}

	public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\DemoQA\\error" + name + ".png"));
	}
}
