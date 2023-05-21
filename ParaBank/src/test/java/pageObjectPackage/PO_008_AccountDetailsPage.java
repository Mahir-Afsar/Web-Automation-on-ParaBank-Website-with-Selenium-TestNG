package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonMethods;

public class PO_008_AccountDetailsPage extends CommonMethods{

	WebDriver driver = null;
	public PO_008_AccountDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody/tr[2]/td[2]/a[1]")
	public WebElement fundsTransferRecievedField;
	
	public void clickOnFundsTransferRecievedField() {
		clickElement(driver, fundsTransferRecievedField);
	}
	
	public By transactionIdFieldBy = By.xpath("//tbody/tr[1]/td[2]");
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	public WebElement transactionIdField;
	
	@FindBy(xpath = "//a[normalize-space()='Find Transactions']")
	public WebElement findTransactionField;
	
	public void clickOnFindTransaction() {
		clickElement(driver, findTransactionField);
	}
}
