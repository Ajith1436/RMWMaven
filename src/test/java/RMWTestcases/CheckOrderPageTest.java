package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckOrderPageTest extends RMWBaseClass {
	@Test
	public void CheckOrderData() throws InterruptedException {
		CheckOrderFunction("US0000196858", "ajith.mohan@tryzens.com");
	}

	public void CheckOrderFunction(String OrderNoVal, String OrderEmailVal) throws InterruptedException {
		// click on My Account icon
		WebElement myAccountlink = driver.findElement(By.xpath("//div/i[@title='Account Icon']"));
		myAccountlink.click();

		// Click Check an order status link
		WebElement checkOrderStatusLink = driver
				.findElement(By.xpath("//a[@class='text-link-3-md d-block changeForm track-order-link']"));
		checkOrderStatusLink.click();
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
