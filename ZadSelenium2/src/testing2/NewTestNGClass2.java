package testing2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;


public class NewTestNGClass2 extends BaseClass2 {	
	
	private Object[] selenuim_commands;

	@Test
	public void OpenSite() throws Exception {
		
		testInfo.log(Status.INFO, "Starting the test");
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("strong")).getText(), "Read this message in your script and Print this in Console");
		System.out.println("ToolsQA is a leading provider of technology content for learning.");
		
		//driver.findElement(By.id("menu-item-374")).click();
		//jse.executeScript("scroll(250, 0)");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Pero");
		
		driver.findElement(By.id("lastname")).sendKeys("Peric");
		
		//driver.findElements(By.name("radio_4[]")).get(0).click();
		//driver.findElements(By.name("checkbox_5[]")).get(1).click();
		
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-5")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("06.04.2020.");
		
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("photo")).sendKeys(System.getProperty("user.dir")+".\\Photo\\image_photo.jpg");
		
		Select drpContinents = new Select(driver.findElement(By.name("continents")));
		drpContinents.selectByValue("EU");
				
		Select selenium_commands = new Select(driver.findElement(By.id("selenium_commands")));
		selenium_commands.selectByVisibleText("Browser Commands");
		selenium_commands.selectByVisibleText("Switch Commands");
		
		
		//Assert.assertEquals(driver.findElement(By.cssSelector("h1.entry-title")).getText(), "Datepicker");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[2]/ul/li[18]/a")).click();
		driver.findElement(By.id("datepicker")).sendKeys("03/06/2020");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[1]/ul/li[4]/a")).click();
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable")); 
		WebElement target = driver.findElement(By.id("droppable")); 
		act.dragAndDrop(source,target).perform();
		
		testInfo.log(Status.INFO, "This is an example of test");
		
		/*
		driver.findElement(By.id("description")).sendKeys("Hi, I am Pero");
		driver.findElement(By.id("password_2")).sendKeys("PeroPericPerica");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("PeroPericPerica");
		*/
	}
}