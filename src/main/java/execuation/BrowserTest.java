package execuation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class BrowserTest extends BaseClass {

	@BeforeSuite
	public void first() {
		browserLaunch();
	}
	
	
	@Test
	public void flipkart() {
		//Assert.assertFalse(true);
		Url("https://www.flipkart.com/");
	}
	
	@Test
	public void snapDeal() {
		Url("https://www.snapdeal.com/");
	}
	
	@Test
	public void amazone() {
		Url("https://www.amazon.in/");
	}
	
	@AfterSuite
	public void after() {
		driver.quit();;
	}
}
