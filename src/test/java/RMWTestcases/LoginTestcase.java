package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTestcase extends RMWBaseClass {
	@Test
	public void Logindata() {
		LoginFunction("Ajith.Mohan@tryzens.com","Testing@123" );
	}
	
	
	public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		// click on My Account icon
		WebElement myAccountlink = driver.findElement(By.xpath("//div/i[@title='Account Icon']"));
		myAccountlink.click();

		WebElement Loginemail = driver.findElement(By.xpath("//input[@name='loginEmail']"));
		Loginemail.sendKeys(UserNameVal);

		WebElement LoginPassword = driver.findElement(By.xpath("//input[@name='loginPassword']"));
		LoginPassword.sendKeys(PasswordVal);

		WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary sign-in-btn']"));
		LoginBtn.click();
	}
}
