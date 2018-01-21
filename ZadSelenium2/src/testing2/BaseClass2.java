package testing2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


public class BaseClass2 {
	
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest testInfo;
	public ExtentHtmlReporter htmlReporter;
	public JavascriptExecutor jse;

	
	@BeforeTest
	public void setup(){
		htmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Report.html"));
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
		reports = new ExtentReports();
		reports.setSystemInfo("Environment", "QA");
		reports.attachReporter(htmlReporter);
		
		htmlReporter.config().setDocumentTitle("Test example");
		htmlReporter.config().setReportName("Test Report");
	}
	
	
	@BeforeMethod
	public void beforeMethod(Method method) throws Exception{		
		System.setProperty("webdriver.chrome.driver",".\\local\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		jse = (JavascriptExecutor)driver;
		
		String testName=method.getName();
		testInfo=reports.createTest(testName);		
		
		testInfo.log(Status.INFO, "Browser Session Started");	
	}
	
		
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception{
		if(result.getStatus()==ITestResult.SUCCESS){
			testInfo.log(Status.PASS, "The Test Method" + (result.getName() + " passed"));
		}
		else if(result.getStatus()==ITestResult.FAILURE){
			testInfo.log(Status.FAIL, "The Test Method" + (result.getName() + " failed"));
			testInfo.fail(result.getThrowable());
		}
		else{
			testInfo.log(Status.SKIP, "The Test Method" +(result.getName() + " skipped"));
		}
		driver.quit();
		testInfo.log(Status.INFO, "Browser Session End");
		
		}
	
	
	@AfterTest
	public void cleanUp(){
		reports.flush();
	}
}