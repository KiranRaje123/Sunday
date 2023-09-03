package gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseLayer.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(priority = 1)
	public void validateHomePageUrl() {

		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl.contains("mail.google"), true);
	}

	@Test(priority = 2)
	public void validateHomePageTitle() {

		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "gmail login");
	}

}
