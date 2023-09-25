package TestData;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.RegisterPatient_Page;

public class PatientData extends RegisterPatient_Page {

	@Test(priority = 1)
	public static void click_Register_menu() throws InterruptedException {
		click_register_menu.click();
	}

	@Test(priority = 2)
	public static void demographics() throws InterruptedException {
		given_name.sendKeys("Luke");
		family_name.sendKeys("Jong");
		next_btn.click();
		Select gender = new Select(select_gender);
		gender.selectByValue("M");
		next_btn.click();
		birth_day.sendKeys("26");
		Select month = new Select(birth_month);
		month.selectByValue("4");
		birth_year.sendKeys("1997");
		next_btn.click();
	}

	@Test(priority = 3)
	public static void contactInfo() throws InterruptedException {
		address.sendKeys("India");
		next_btn.click();
		patient_phone.sendKeys("98959298");
		next_btn.click();
		Select relation = new Select(relation_type);
		relation.selectByVisibleText("Parent");
		person_name.sendKeys("Ramesh");
		next_btn.click();
		click_submit.click();
	}

	@Test(priority = 4)
	public static void verify_patient_vist() throws InterruptedException, AWTException {
		click_start_visit.click();
		start_confirm.click();	
		click_attachment.click();
		click_upload_image.click();
		
	    Robot rb = new Robot();
	    StringSelection image_file = new StringSelection("C:\\Users\\UPL2\\Desktop\\image123.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(image_file, null);
	 
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	   
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(55000);
		enter_caption.sendKeys("my image");
		Thread.sleep(5000);
		
		click_upload_file.click();		
		back_to_visitpage.click();
		click_end_visit.click();
		end_visit_confirm.click();
		click_delete_patient.click();
		enter_delete_reason.sendKeys("completed");
		delete_confirm.click();
		find_the_person.sendKeys("Luke");

	}

}
