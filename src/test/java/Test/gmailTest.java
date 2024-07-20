package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.gmailLoginPage;
import utility.parameterization;

public class gmailTest extends BaseTest {
	@Test
	
		@BeforeMethod
		public void openApplication() {
			driver = Browser.launchBrowser("https://mail.google.com");
		}
		@Test
		public void verifyIfUserIsAbleToEnterEmailId() throws EncryptedDocumentException, IOException {
			gmailLoginPage gmailloginpage=new gmailLoginPage(driver);
			gmailloginpage.EnterEmail();
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofMillis(5000));
			wait.pollingEvery(Duration.ofMillis(5000));
			gmailloginpage.ClickOnnext();

		}
	

		}
	


