package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;
import io.qameta.allure.Step;

public class PO_005_OpenNewAccountPage extends CommonMethods{
	
	WebDriver driver = null;
	public PO_005_OpenNewAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public By typeOfAccountFieldBy = By.xpath("//select[@id='type']");
	public By existingAccountFieldOnNewAccountPageBy = By.xpath("//select[@id='fromAccountId']");
	
	@FindBy(xpath = "//select[@id='type']")
	public WebElement typeOfAccountField;
	
	
	@FindBy(xpath = "//input[@value='Open New Account']")
	public WebElement openNewAccountButtonField;
	
	@FindBy(xpath = "//select[@id='fromAccountId']")
	public WebElement existingAccountFieldOnNewAccountPage;
	
	@Step("Select Account type")
	public void selectTypeOfAccount(String accountValue) {
		selectItem(typeOfAccountField, accountValue);
	}
	
	public void existingAccountNumber(String accountValue) {
		selectItem(existingAccountFieldOnNewAccountPage, accountValue);
	}
	
	@Step("Click on Open New Account button")
	public void clickOnOpenNewAccountButton() {
		clickElement(driver, openNewAccountButtonField);
	}
	
	
	
	
}
