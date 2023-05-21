package pageObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_003_CustomerCreatedPage extends CommonMethods{
	
	WebDriver driver = null;
	public PO_003_CustomerCreatedPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	public WebElement logoutField;
	
	@Step("Click On log out button")
	public void clickOnLogOutButton() {
		clickElement(driver, logoutField);
	}
	
	public String customerCreatedPageTitle = "ParaBank | Customer Created";
}
