package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import RMWPages.NewsLetterSubscriptionPage;

public class NewsLetterSubscriptionTest extends RMWBaseClass {
	@Test
	public void NewsLetterSubscriptionData() throws FilloException, InterruptedException {
		Recordset recordset = connection.executeQuery("select * from data where TestName='ValidNewsLetter'");
		recordset.next();

		String Username = recordset.getField("UserName");

		NewsLetterSubscriptionPage NewsLetter = new NewsLetterSubscriptionPage(driver);
		NewsLetter.NewsLetterFunction(Username);

		//WebElement EmailSubSuccess= driver.findElement(By.xpath("//div[@class='body-2 body-2-md']"));
		WebElement EmailSubSuccess= driver.findElement(By.xpath("//div/h4[@class='success-message-header']"));
		String ActualSuccessmsg = EmailSubSuccess.getText();
		//String ExpSuccessmsg = "Your sign up is complete.";
		String ExpSuccessmsg = "Thank you";
		Assert.assertEquals(ActualSuccessmsg, ExpSuccessmsg);
	}
}