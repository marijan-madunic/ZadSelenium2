package testing2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

//12012022 updated ChromeDriver 97.0.4692.71 
//02042022 If you are using Chrome version 100, please download ChromeDriver 100.0.4896.60
public class NewTestNGClass2 extends BaseClass2 {	
	

	@Test
	public void OpenSite() throws Exception {
		
		testInfo.log(Status.INFO, "Starting the test");
		
		driver.get("https://demoqa.com/automation-practice-form/");
		

		driver.findElement(By.id("firstName")).sendKeys("Pero");
		//driver.findElement(By.id("lastName")).sendKeys("Peric");
		driver.findElement(By.id("userEmail")).sendKeys("Pero@example.com");
			
		
		driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[@class='practice-form-wrapper']/form[@id='userForm']/div[@id='genterWrapper']/div[@class='col-md-9 col-sm-12']/div[@class='custom-control custom-radio custom-control-inline'][1]/label[@class='custom-control-label']")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("0951234567");		
		
		driver.findElement(By.id("dateOfBirthInput")).clear();
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("06 Jun 2020");
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys(System.getProperty("user.dir")+".\\Photo\\image_photo.jpg");
	
		//driver.findElement(By.id("currentAddress-label")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("Street");
		
		
		testInfo.log(Status.INFO, "This is an example of test");
		
	}
}