package gmail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import utilsLayer.ExcelReader;

public class ComposePageTest extends BaseClass{
@Test(priority=1,dataProvider="getContactData")
	public void validateComposeFunctionality(String sendemail,String cc, String bcc, String subject, String compose) {
		driver.findElement(By.xpath("(//div[@role='button'])[7]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(sendemail);
		driver.findElement(By.xpath("(//span[@role='link'])[3]")).click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys(cc);
		driver.findElement(By.xpath("(//span[@role='link'])[4]")).click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).sendKeys(bcc);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(subject);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(compose);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
	}
     @DataProvider
     public Object[][] getContactData() throws IOException
     {
	ExcelReader obj=new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\java\\testDataLayer\\gmail.xlsx");
	
	Object[][] data=obj.getAllSheetData(0);
	return data;
	
	
}
	
		
		
	
	
	
}
