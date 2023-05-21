package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_001_HomePage extends CommonMethods{

	WebDriver driver = null;
	public PO_001_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	public WebElement registerLink;
	
	
	@Step("Click on Register link")
	public void clickOnRegister() {
		clickElement(driver, registerLink);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement loginUserNameField;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement loginPasswordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement loginButtonField;
	
	@Step("Fill the login information")
	public void fillLoginInformation(String userName, String password) {
		sendText(loginUserNameField, userName);
		sendText(loginPasswordField, password);
	}
	
	@Step("Click on the login button")
	public void clickOnLoginButton() {
		clickElement(driver, loginButtonField);
	}
	
}
