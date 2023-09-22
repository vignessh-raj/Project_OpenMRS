package Main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import Pages.RegisterPatient_Page;

public class Index {
	protected static WebDriver driver;

	@BeforeSuite
	public WebDriver launch_Browser() {

		String driverLocation = "C:\\Users\\UPL2\\useee\\OpenMRS\\Utility\\chromedriver.exe";
		String url = "https://qa-refapp.openmrs.org/openmrs/login.htm";

		System.setProperty("webdriver.chrome.driver", driverLocation);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		return driver;
	}

	@BeforeSuite
	public void login() throws IOException {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();

		String verifyTitle = driver.getTitle();

		 //Assert.assertEquals(verifyTitle,"Home","Title is not Matching");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(verifyTitle, "Home", "Title is not Matching");

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // Saving the screenshot in desired location
		String destinationPath = "Utility\\Screenshots\\screenshot.png";
		FileHandler.copy(screenshotFile, new File(destinationPath)); // Path to the location to save screenshot
		pageFactory();
	}


	public static void pageFactory() {
		PageFactory.initElements(driver, RegisterPatient_Page.class);
	}
	@AfterSuite
	public static void tear_down() {
		// driver.quit();
	}

}
