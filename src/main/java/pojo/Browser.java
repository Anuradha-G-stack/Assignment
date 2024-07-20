package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browser {
	public static WebDriver launchBrowser(String url) 
	{
		System.setProperty("webdriver.chromedriver.driver", "D:\\testing\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	return driver;

}
/*
 * public static void main(String[] args) {
 * Browser.launchBrowser("https://mail.google.com");
 * 
 * }
 */
}
