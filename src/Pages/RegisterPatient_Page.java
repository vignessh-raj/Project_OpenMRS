package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Main.Index;

public class RegisterPatient_Page extends Index {

	@FindBy(xpath = "//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]\r\n"
			+ "")
	public static WebElement click_register_menu;

	@FindBy(xpath = "//*[@name=\"givenName\"]")
	public static WebElement given_name;

	@FindBy(xpath = "//*[@name=\"familyName\"]")
	public static WebElement family_name;

	@FindBy(xpath = "//*[@id=\"next-button\"]")
	public static WebElement name_next_btn;

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
	
	//--------Patient visit starting--------
	
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
	

}
