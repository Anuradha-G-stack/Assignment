package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	@FindBy(xpath = "(//a[@data-track-name='godaddy_logo'])[1]")
	private WebElement logo;
	@FindBy(xpath = "//span[@class='pl-b1qxqzy9']")
	private List<WebElement> menu;
	@FindBy(xpath = "(//span[@data-cy='list-item'])")
	private List<WebElement> website;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getMenu(int index) {
		menu.get(index).click();
	}

	public void websiteDropDown(int index) {
		website.get(index).click();
	}

	public void clickOnLogo() {
		logo.click();
	}
}
