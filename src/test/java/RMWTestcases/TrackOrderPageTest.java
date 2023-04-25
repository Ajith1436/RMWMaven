package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TrackOrderPageTest extends RMWBaseClass {
	
	@Test
	public void CheckOrderData() throws InterruptedException {
		CheckOrderFunction("US0000196858", "ajith.mohan@tryzens.com");
	}

	public void CheckOrderFunction(String OrderNoVal, String OrderEmailVal) throws InterruptedException {
		
		// Click Track order status link from Footer
		WebElement trackOrderStatusLink = driver
				.findElement(By.xpath("//a[@class='track-order']"));
		trackOrderStatusLink.click();
		Thread.sleep(3000);

		// Enter Order Number
		WebElement orderNumberTxt = driver.findElement(By.xpath("//input[@id='trackorder-form-number']"));
		orderNumberTxt.sendKeys(OrderNoVal);

		// Enter Order Email
		WebElement orderEmailTxt = driver.findElement(By.xpath("//input[@id='trackorder-form-email']"));
		orderEmailTxt.sendKeys(OrderEmailVal);

		// Click Check Order Status Button
		WebElement CheckOrderStatusBtn = driver
				.findElement(By.xpath("//button[@class='btn btn-block btn-primary order-track-button']"));
		CheckOrderStatusBtn.click();
		Thread.sleep(3000);
	}
}
