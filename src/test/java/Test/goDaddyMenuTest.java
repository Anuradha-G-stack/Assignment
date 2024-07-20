package Test;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.HomePage;

public class goDaddyMenuTest extends BaseTest {
	@BeforeMethod
	public void openApplication() {
		driver = Browser.launchBrowser("https://www.godaddy.com");
	}
	
	@Test
	public  void  verifyIfUserIsAbleToClickOnMenuDomain() {
		HomePage homepage=new HomePage(driver);
		homepage.getMenu(0);
		homepage.websiteDropDown(0);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Search"));
		 homepage. clickOnLogo();
	}

	@Test
	public void verifyIfUserIsAbleToClickOnMenuWebsite() {
		HomePage homepage=new HomePage(driver);
		homepage.getMenu(1);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(5000));
		wait.pollingEvery(Duration.ofMillis(5000));
		homepage.websiteDropDown(9);
		String title=driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Builder"));
        homepage. clickOnLogo();
	}
	
	@Test
	public void verifyIfUserIsAbleToClickOnMenuSecurity() {
		HomePage homepage=new HomePage(driver);
		homepage.getMenu(2);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(5000));
		wait.pollingEvery(Duration.ofMillis(5000));
		homepage.websiteDropDown(16);
		String title=driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("SSL"));
        homepage. clickOnLogo();
	}
	@Test
	public void verifyIfUserIsAbleToClickOnMenuMarketing() {
		
		HomePage homepage=new HomePage(driver);
		homepage.getMenu(3);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(5000));
		wait.pollingEvery(Duration.ofMillis(5000));
		homepage.websiteDropDown(20);
		String title=driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Digital"));
        homepage. clickOnLogo();
	}
	
}


