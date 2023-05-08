package RMWPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlyoutPage {
	WebDriver Pagedriver;

	
	
	// ===========Objects========================//
	@FindBy(xpath="//div/i[@title='Account Icon']")
	WebElement myAccountlink;
	
	@FindBy(xpath="//input[@name='loginEmail']")
	WebElement Loginemail;
	
	@FindBy(xpath="//input[@name='loginPassword']")
	WebElement LoginPassword;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary sign-in-btn']")
	WebElement LoginBtn;
	
	
	
	// ======================Methods====================//
	
	public LoginFlyoutPage(WebDriver driver) {
		Pagedriver = driver;
		PageFactory.initElements(Pagedriver, this);

	}
	
public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		// click on My Account icon
		myAccountlink.click();

		//Enter login Email
		Loginemail.sendKeys(UserNameVal);

		//Enter login Password
		LoginPassword.sendKeys(PasswordVal);

		//Click on login Button
		LoginBtn.click();
	}

}
