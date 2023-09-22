package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import Pages.RegisterPatient_Page;

public class Index {
	static WebDriver driver;

	@BeforeSuite
	public WebDriver launch_Browser() {

		String driverLocation = "C:\\Users\\UPL2\\useee\\OpenMRS\\Utility\\chromedriver.exe";
		String url = "https://qa-refapp.openmrs.org/openmrs/login.htm";

		System.setProperty("webdriver.chrome.driver", driverLocation);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeSuite
	public void login() {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		
        String actualResult=driver.getTitle();
       // Assert.assertEquals(actualResult,"Home","Title is not Matching");       
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, "Home", "Title is not Matching");

		pageFactory();
	}

	public static void pageFactory() {
		PageFactory.initElements(driver, RegisterPatient_Page.class);

	}

	@AfterSuite
	public static void tear_down() throws InterruptedException {
		// driver.quit();

	}

}
