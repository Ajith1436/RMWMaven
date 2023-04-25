package RMWTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RMWBaseClass {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		// step-1 : Launch chrome browser and open simplilearn website

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.edgedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// this.driver = new EdgeDriver();
		// this.driver = new FirefoxDriver();
		this.driver = new ChromeDriver();
		driver.get("https://www.rmwilliams.com/");

		// step-2: Maximize the browser

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		// Click on COntinue Browsing
		WebElement ContinueBrowseBtn = driver.findElement(By.xpath("//div/button[text()='Continue Browsing']"));
		ContinueBrowseBtn.click();

		// Accept Cookies
		WebElement accptcookieBtn = driver.findElement(By.xpath("//span/button[@id='consent_prompt_submit']"));
		accptcookieBtn.click();
	}

	//@AfterMethod
	//public void teardown() {
		//driver.quit();
	//}
}
