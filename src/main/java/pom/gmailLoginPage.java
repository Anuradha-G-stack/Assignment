package pom;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.parameterization;

public class gmailLoginPage extends BasePage {
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement next;

	public gmailLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void EnterEmail() throws EncryptedDocumentException, IOException {

		email.sendKeys(parameterization.getData(0,0,"Sheet1"));
	}

	public void ClickOnnext() {
		next.click();
	}
}
