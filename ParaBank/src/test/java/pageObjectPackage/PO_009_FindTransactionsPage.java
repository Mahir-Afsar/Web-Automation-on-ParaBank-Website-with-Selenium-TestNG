package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;

public class PO_009_FindTransactionsPage extends CommonMethods{

	WebDriver driver = null;
	public PO_009_FindTransactionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public By selectAnAccountFieldBy = By.xpath("//select[@id='accountId']");
	public By findByTransactionIDFieldBy = By.xpath("//input[@id='criteria.transactionId']");
	
	@FindBy(xpath = "//select[@id='accountId']")
	public WebElement selectAnAccountField;
	
	public void selectAnAccout(String value) {
		selectItem(selectAnAccountField, value);
	}
	
	@FindBy(xpath = "//input[@id='criteria.transactionId']")
	public WebElement findByTransactionIDField;
	
	public void fillFindbyTransactionID(String value) {
		sendText(findByTransactionIDField, value);
	}
	
	@FindBy(xpath = "//button[@ng-click=\"criteria.searchType = 'ID'\"]")
	public WebElement FindTransactionsField;
	
	public void clickOnFindTransactions() {
		clickElement(driver, FindTransactionsField);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Update Contact Info']")
	public WebElement updateContactInfoField;
	
	public void clickOnUpdateContactInfo() {
		clickElement(driver, updateContactInfoField);
	}
	
	
}
