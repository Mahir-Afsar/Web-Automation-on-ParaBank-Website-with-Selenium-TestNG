package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_002_RegistrationPage extends CommonMethods{
	
	WebDriver driver = null;
	public PO_002_RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='customer.firstName']")
	public WebElement firstNameField;
	
	@FindBy(xpath = "//input[@id='customer.lastName']")
	public WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='customer.address.street']")
	public WebElement addressField;
	
	@FindBy(xpath = "//input[@id='customer.address.city']")
	public WebElement cityField;
	
	@FindBy(xpath = "//input[@id='customer.address.state']")
	public WebElement stateField;
	
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	public WebElement zipCodeField;
	
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	public WebElement phoneNumberField;
	
	@FindBy(xpath = "//input[@id='customer.ssn']")
	public WebElement ssnField;
	
	@FindBy(xpath = "//input[@id='customer.username']")
	public WebElement userNameField;
	
	@FindBy(xpath = "//input[@id='customer.password']")
	public WebElement passwordField;
	
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	public WebElement confirmPasswordField;
	
	@Step("Fill the registration information")
	public void fillRegistrationInformation(String firstName, String lastName, String address, String city, String state, 
			String zipCode, String phoneNumber, String ssn, String UserName, String password, String confirmPassword) {
		
		sendText(firstNameField, firstName);
		sendText(lastNameField, lastName);
		sendText(addressField, address);
		sendText(cityField, city);
		sendText(stateField, state);
		sendText(zipCodeField, zipCode);
		sendText(phoneNumberField, phoneNumber);
		sendText(ssnField, ssn);
		sendText(userNameField, UserName);
		sendText(passwordField, password);
		sendText(confirmPasswordField, confirmPassword);
		
	}
	
	@FindBy(xpath = "//input[@value='Register']")
	public WebElement registerButtonField;
	
	@Step("Click On Register Button")
	public void clickOnRegisterButton() {
		clickElement(driver, registerButtonField);
	}
	
	public String registrationPageTitle = "ParaBank | Register for Free Online Account Access";
	
	
	
}
