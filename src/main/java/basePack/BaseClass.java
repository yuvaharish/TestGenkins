package basePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
public static WebDriver driver;
	
	public  void browserLaunch() {
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe"
		 * );
		 */
		//Yuvaraj
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
	}

	public void Url(String siteName) {
		//diver 
		driver.get(siteName);
	}

	public void typeText(WebElement element,String text) {
		element.sendKeys(text);
	}

	public void elementClick(WebElement element) {
		element.click();
	}

}
