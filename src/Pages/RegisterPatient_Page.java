package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Main.Index;

public class RegisterPatient_Page  {
	
	

	@FindBy(xpath = "//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]\r\n"
			+ "")
	public static WebElement click_register_menu;

	@FindBy(xpath = "//*[@name=\"givenName\"]")
	public static WebElement given_name;

	@FindBy(xpath = "//*[@name=\"familyName\"]")
	public static WebElement family_name;

	@FindBy(xpath = "//*[@id=\"next-button\"]")
	public static WebElement next_btn;

	@FindBy(xpath = "//*[@id=\"gender-field\"]")
	public static WebElement select_gender;

	@FindBy(xpath = "//*[@name=\"birthdateDay\"]")
	public static WebElement birth_day;

	@FindBy(xpath = "//*[@name=\"birthdateMonth\"]")
	public static WebElement birth_month;

	@FindBy(xpath = "//*[@name=\"birthdateYear\"]")
	public static WebElement birth_year;

	@FindBy(xpath = "//*[@id=\"address1\"]")
	public static WebElement address;

	@FindBy(xpath = "//*[@name=\"phoneNumber\"]")
	public static WebElement patient_phone;

	@FindBy(xpath = "//*[@name=\"relationship_type\"]")
	public static WebElement relation_type;

	@FindBy(xpath = "/html/body/div[1]/div[3]/form/section[3]/div/fieldset/div/div/p[2]/input[1]")
	public static WebElement person_name;

	@FindBy(xpath = "//*[@id=\"submit\"]\r\n" + "")
	public static WebElement click_submit;

	//--------Patient visit page object starting--------

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[1]/a/div/div[2]\r\n"
			+ "")
	public static WebElement click_start_visit;

	@FindBy(xpath = "//*[@id=\"start-visit-with-visittype-confirm\"]")
	public static WebElement start_confirm;

	@FindBy(xpath = "//*[@id=\"attachments.attachments.visitActions.default\"]")
	public static WebElement click_attachment;

	@FindBy(xpath = "//*[@id=\"visit-documents-dropzone\"]")
	public static WebElement click_upload_image;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[1]/att-file-upload/div[3]/div/div[2]/textarea")
	public static WebElement enter_caption;
	
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[3]/div[1]/att-file-upload/div[3]/div/div[2]/span/button[1]")
	public static WebElement click_upload_file;
	
	@FindBy(xpath = "/html/body/ul/li[2]/a")
	public static WebElement back_to_visitpage;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div[3]/div/ul[1]/li[1]/a/div/div[2]")
	public static WebElement click_end_visit;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/button[1]")
	public static WebElement end_visit_confirm;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[8]/a/div/div[2]")
	public static WebElement click_delete_patient;
			
	@FindBy(xpath = "//*[@id=\"delete-reason\"]")
	public static WebElement enter_delete_reason;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[2]/button[1]")
	public static WebElement delete_confirm;
				
	@FindBy(xpath = "//*[@id=\"patient-search\"]")
	public static WebElement find_the_person;

	
}
