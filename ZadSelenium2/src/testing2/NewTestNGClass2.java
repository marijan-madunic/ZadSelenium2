package testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;


public class NewTestNGClass2 extends BaseClass2 {	
	
	@Test
	public void OpenSite() throws Exception {
		
		testInfo.log(Status.INFO, "Starting the test");
		
		driver.get("http://demoqa.com");
		
		driver.findElement(By.id("menu-item-374")).click();
		
		driver.findElement(By.id("name_3_firstname")).sendKeys("Pero");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Peric");
		driver.findElements(By.name("radio_4[]")).get(0).click();
		driver.findElements(By.name("checkbox_5[]")).get(1).click();
		
		driver.findElement(By.id("dropdown_7")).sendKeys("Croatia");
		
		driver.findElement(By.id("mm_date_8")).sendKeys("5");
		driver.findElement(By.id("dd_date_8")).sendKeys("5");
		driver.findElement(By.id("yy_date_8")).sendKeys("1955");
			
		driver.findElement(By.id("phone_9")).sendKeys("00385951234567");
		driver.findElement(By.id("username")).sendKeys("Pero");
		driver.findElement(By.id("email_1")).sendKeys("pero@example.com");
		driver.findElement(By.id("profile_pic_10")).sendKeys(System.getProperty("user.dir")+".\\Photo\\image_photo.jpg");
		driver.findElement(By.id("description")).sendKeys("Hi, I am Pero");
		driver.findElement(By.id("password_2")).sendKeys("PeroPericPerica");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("PeroPericPerica");
			
		jse.executeScript("scroll(250, 0)");

		Assert.assertEquals(driver.findElement(By.cssSelector("h1.entry-title")).getText(), "Registration");
		
		driver.findElement(By.id("menu-item-38")).click();
		
		driver.findElement(By.id("menu-item-141")).click();
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggableview")); 
		WebElement target = driver.findElement(By.id("droppableview")); 
		act.dragAndDrop(source,target).perform();
		
		driver.findElement(By.id("menu-item-146")).click();
		
		driver.findElement(By.id("datepicker1")).sendKeys("November 13, 2017");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("h1.entry-title")).getText(), "Datepicker");
		
		testInfo.log(Status.INFO, "This is an example of test");
	}
}