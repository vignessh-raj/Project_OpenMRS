package TestData;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Pages.RegisterPatient_Pages;

public class PatientData extends RegisterPatient_Pages {
	


	@Test(priority = 1)
	public static void click_Register_menu() throws InterruptedException {
		click_register_menu.click();		
	}

	@Test(priority = 2)
	public static void demographics() throws InterruptedException {
		given_name.sendKeys("Luke");
		family_name.sendKeys("Jong");
		name_next_btn.click();
		Select gender = new Select(select_gender);
		gender.selectByValue("M");
		name_next_btn.click();
		birth_day.sendKeys("26");
		Select month = new Select(birth_month);
		month.selectByValue("4");
		birth_year.sendKeys("1997");
		name_next_btn.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public static void contactInfo()  {		 
		
		address.sendKeys("India");
		name_next_btn.click();
		Select relation = new Select(relation_type);
		relation.selectByVisibleText("Parent");
		// person_name.sendKeys("Ramesh");
	}

}
