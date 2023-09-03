package gmail;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLayer.BaseClass;

public class LoginPageTest extends BaseClass {
	@BeforeTest
	public void setup() {
		BaseClass.initialisation();
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() {
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("teachersastesters");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
