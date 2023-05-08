package RMWPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
WebDriver Pagedriver;
	
	// ===========Objects of SignUp Page========================//

@FindBy(xpath="//div/i[@title='Account Icon']")
WebElement myAccountlink;

@FindBy(xpath="//button[@class='btn btn-block btn-primary changeForm']")
WebElement createAccountBtn;

@FindBy(xpath="//input[@id='registration-form-fname']")
WebElement FirstnameTxt;

@FindBy(xpath="//input[@id='registration-form-lname']")
WebElement LastnameTxt;

@FindBy(xpath="//input[@id='registration-form-email']")
WebElement emailTxt;

@FindBy(xpath="//input[@id='registration-form-password']")
WebElement passwordTxt;

@FindBy(xpath="//label[@class='custom-control-label form-control-label-checkbox']")
WebElement newsletterCheckbox;

@FindBy(xpath="//button[@class='btn btn-block btn-primary create-account-button']")
WebElement finalcreateAccountBtn;

@FindBy(xpath="//a[@class='hover-link-1 closeSignInOverlay']")
WebElement NotRightNowLink;

@FindBy(xpath="//select[@id='birthdate']")
WebElement Selectedday;

@FindBy(xpath="//select[@id='birthmonth']")
WebElement SelectMonth;

@FindBy(xpath="//select[@id='birthyear']")
WebElement SelectYear;

@FindBy(xpath="//button[@class='btn btn-block btn-primary save-dob-action']")
WebElement SaveDobBtn;

public SignUpPage(WebDriver driver) {
	Pagedriver = driver;
	PageFactory.initElements(Pagedriver, this);
}

public void SignUpFunction(String firstnameVal, String lastnameVal, String emailVal, String PasswordVal,String DayVal, String MonthVal, String YearVal) throws InterruptedException {
			// click on My Account icon
			myAccountlink.click();
			
			//Click Create Account button
			createAccountBtn.click();
			
			//Enter First Name
			FirstnameTxt.sendKeys(firstnameVal);
			
			//Enter Last Name
			LastnameTxt.sendKeys(lastnameVal);
			
			//Enter email id
			emailTxt.sendKeys(emailVal);
			
			//Enter Password 
			passwordTxt.sendKeys(PasswordVal);
			
			//Tick newsletters Checkbox	
			newsletterCheckbox.click();
			Thread.sleep(3000);
			
			
			finalcreateAccountBtn.click();
			Thread.sleep(3000);
			
			Select ddday = new Select(Selectedday);
			ddday.selectByValue("DayVal");
			
			Select ddmonth = new Select(SelectMonth);
			ddmonth.selectByValue(MonthVal);
			
			Select ddyear = new Select(SelectYear);
			ddyear.selectByValue(YearVal);
			SaveDobBtn.click();

			// Click on Not Right Now Link
			//NotRightNowLink.click();
			
}
			//public void CongratulationsPage(String DayVal, String MonthVal, String YearVal) {
			//Select day for Date of Birth
			//Selectedday.sendKeys(DayVal);
			//SelectMonth.sendKeys(DayVal);
			//SelectYear.sendKeys(YearVal);
			
			
}
