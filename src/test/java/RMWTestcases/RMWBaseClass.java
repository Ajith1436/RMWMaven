package RMWTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RMWBaseClass {

	public WebDriver driver;
	Fillo fillo;
	Connection connection;
	
	@BeforeTest
	public void Reportsetup() throws FilloException {
		// report = new ExtentReports("ExtendReports.html");
		fillo = new Fillo();
		connection = fillo.getConnection("DataSheet.xlsx");
	}
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
