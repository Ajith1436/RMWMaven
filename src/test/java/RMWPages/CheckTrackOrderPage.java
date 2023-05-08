package RMWPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckTrackOrderPage {

	WebDriver Pagedriver;
	
	// ===========Objects of Check Order Page========================//
	
	@FindBy(xpath="//div/i[@title='Account Icon']")
	WebElement myAccountlink;
	
	@FindBy(xpath="//a[@class='text-link-3-md d-block changeForm track-order-link']")
	WebElement checkOrderStatusLink;
	
	@FindBy(xpath="//input[@id='trackorder-form-number']")
	WebElement orderNumberTxt;
	
	@FindBy(xpath="//input[@id='trackorder-form-email']")
	WebElement orderEmailTxt;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary order-track-button']")
	WebElement CheckOrderStatusBtn;
	
	@FindBy(xpath="//a[@class='track-order']")
	WebElement trackOrderStatusLink;
	
	
	// ======================Methods====================//
	
	public CheckTrackOrderPage(WebDriver driver) {
		Pagedriver = driver;
		PageFactory.initElements(Pagedriver, this);

	}
	
	
	public void CheckOrderFunction(String OrderNoVal, String OrderEmailVal) throws InterruptedException {
		// click on My Account icon
		myAccountlink.click();

		// Click Check an order status link
		checkOrderStatusLink.click();
		Thread.sleep(3000);

		// Enter Order Number
		orderNumberTxt.sendKeys(OrderNoVal);

		// Enter Order Email
		orderEmailTxt.sendKeys(OrderEmailVal);

		// Click Check Order Status Button
		CheckOrderStatusBtn.click();
		Thread.sleep(3000);
	}
	
public void TrackOrderFunction(String OrderNoVal, String OrderEmailVal) throws InterruptedException {
		
		// Click Track order status link from Footer
		trackOrderStatusLink.click();
		Thread.sleep(3000);

		// Enter Order Number
		orderNumberTxt.sendKeys(OrderNoVal);

		// Enter Order Email
		orderEmailTxt.sendKeys(OrderEmailVal);

		// Click Check Order Status Button
		CheckOrderStatusBtn.click();
		Thread.sleep(3000);
	}
}
