package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import RMWPages.LoginFlyoutPage;

public class LoginTestcase extends RMWBaseClass {
	
	@Test
	public void Logindata() throws FilloException {
		Recordset recordset = connection.executeQuery("select * from data where TestName='test1'");
		recordset.next();
		
		String Username = recordset.getField("UserName");
		String Password = recordset.getField("Password");
		
		LoginFlyoutPage login = new LoginFlyoutPage(driver);
		login.LoginFunction(Username, Password );
		
		
		WebElement welcomeMsg = driver.findElement(By.xpath("//span[@class='subtitle']"));
		String ActualText = welcomeMsg.getText();
		String ExpText = "Welcome to your account";
		Assert.assertEquals(ActualText, ExpText);
	}
	
	
	
}
