package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Main.Index;

public class RegisterPatient_Pages extends Index {
	
	@FindBy(xpath  = "//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]\r\n"
			+ "")     
	public static WebElement click_register_menu;
	
	
	@FindBy(xpath  = "//*[@name=\"givenName\"]")     
	public static WebElement given_name;
	
	@FindBy(xpath  = "//*[@name=\"familyName\"]")     
	public static WebElement family_name;
	
	@FindBy(xpath  = "//*[@id=\"next-button\"]")     
	public static WebElement name_next_btn;
	
	
	@FindBy(xpath  = "//*[@id=\"gender-field\"]")     
	public static WebElement select_gender;
	
	@FindBy(xpath  = "//*[@name=\"birthdateDay\"]")     
	public static WebElement birth_day;
	
	@FindBy(xpath  = "//*[@name=\"birthdateMonth\"]")     
	public static WebElement birth_month;
	
	@FindBy(xpath  = "//*[@name=\"birthdateYear\"]")     
	public static WebElement birth_year;
	
	@FindBy(xpath  = "//*[@name=\"address1\"]")     
	public static WebElement address;
	
	@FindBy(xpath  = "//*[@name=\"phoneNumber\"]")     
	public static WebElement patient_phone;
	
	@FindBy(xpath  = "//*[@name=\"relationship_type\"]")     
	public static WebElement relation_type;
	
	
	
	/*
	 * @FindBy(className =
	 * "person-typeahead ng-pristine ng-untouched ng-valid ng-empty") public static
	 * WebElement person_name;
	 */
	
	

}
