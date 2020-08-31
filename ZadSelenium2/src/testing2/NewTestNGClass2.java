package testing2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;


public class NewTestNGClass2 extends BaseClass2 {	
	

	@Test
	public void OpenSite() throws Exception {
		
		testInfo.log(Status.INFO, "Starting the test");
		
		driver.get("https://demoqa.com/automation-practice-form/");
		

		driver.findElement(By.id("firstName")).sendKeys("Pero");
		driver.findElement(By.id("lastName")).sendKeys("Peric");
		driver.findElement(By.id("userEmail")).sendKeys("Pero@example.com");
			
		
		driver.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]/label")).get(0).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("0951234567");		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")).get(0).click();
		
		
		driver.findElements(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[1]/label")).get(0).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys(System.getProperty("user.dir")+".\\Photo\\image_photo.jpg");
		
		driver.findElement(By.id("currentAddress-label")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("Street");
		
		
		testInfo.log(Status.INFO, "This is an example of test");
		
	}
}