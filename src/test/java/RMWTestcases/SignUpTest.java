package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpTest extends RMWBaseClass  {

	@Test
	public void Signupdata() throws InterruptedException {
		SignUpFunction("Test","User","Testing4304+3@gmail.com","Testing@123" );
	}
	
	public void SignUpFunction(String firstnameVal, String lastnameVal, String emailVal, String PasswordVal ) throws InterruptedException {
		// click on My Account icon
				WebElement myAccountlink = driver.findElement(By.xpath("//div/i[@title='Account Icon']"));
				myAccountlink.click();
				
				//Click Create Account button
				WebElement createAccountBtn =driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary changeForm']"));
				createAccountBtn.click();
				
				//Enter First Name
				WebElement FirstnameTxt = driver.findElement(By.xpath("//input[@id='registration-form-fname']"));
				FirstnameTxt.sendKeys(firstnameVal);
				
				//Enter Last Name
				WebElement LastnameTxt = driver.findElement(By.xpath("//input[@id='registration-form-lname']"));
				LastnameTxt.sendKeys(lastnameVal);
				
				//Enter email id
				WebElement emailTxt = driver.findElement(By.xpath("//input[@id='registration-form-email']"));
				emailTxt.sendKeys(emailVal);
				
				//Enter Password 
				WebElement passwordTxt = driver.findElement(By.xpath("//input[@id='registration-form-password']"));
				passwordTxt.sendKeys(PasswordVal);
				
				//Tick newsletters Checkbox
				WebElement newsletterCheckbox = driver.findElement(By.xpath("//label[@class='custom-control-label form-control-label-checkbox']"));
				newsletterCheckbox.click();
				Thread.sleep(3000);
				
				WebElement finalcreateAccountBtn =driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary create-account-button']"));
				finalcreateAccountBtn.click();
				
				
				
				
	}
}
