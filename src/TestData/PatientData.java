package TestData;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Pages.RegisterPatient_Page;

public class PatientData extends RegisterPatient_Page {

	@Test(priority = 1)
	public static void click_Register_menu() throws InterruptedException {
		click_register_menu.click();
		Thread.sleep(3000);
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
	}

	@Test(priority = 3)
	public static void contactInfo() throws InterruptedException {
		address.sendKeys("India");
		name_next_btn.click();
		patient_phone.sendKeys("98959298");
		name_next_btn.click();
		Select relation = new Select(relation_type);
		relation.selectByVisibleText("Parent");
		person_name.sendKeys("Ramesh");
		name_next_btn.click();
		click_submit.click();
	}
	
	@Test(priority = 4)
	public static void verify_patient_vist() throws InterruptedException {
		Thread.sleep(5000);
		click_start_visit.click();
		Thread.sleep(3000);
		start_confirm.click();
		Thread.sleep(3000);
		click_attachment.click();
		Thread.sleep(3000);
		click_upload_image.click();
	}

}
