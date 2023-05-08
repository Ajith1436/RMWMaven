package RMWPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsLetterSubscriptionPage {
	WebDriver Pagedriver;
	
	// ===========Objects of SignUp Page========================//
	
	@FindBy(xpath="//div/div/input[@name='newsletter_email']")
	WebElement NewsletterTxt;
	
	@FindBy(xpath="//button[@name='newsletter-button']")
	WebElement NewsletterSubmit;
	
	public NewsLetterSubscriptionPage(WebDriver driver) {
		Pagedriver = driver;
		PageFactory.initElements(Pagedriver, this);

	}


	public void NewsLetterFunction(String UserNameVal) throws InterruptedException {
		NewsletterTxt.sendKeys(UserNameVal);
		
		NewsletterSubmit.click();
		Thread.sleep(5000);
}
}
