package commonPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	public void clickElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();

	}

	public void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void selectItem(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void waitForElement(WebDriver driver, By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}

}
