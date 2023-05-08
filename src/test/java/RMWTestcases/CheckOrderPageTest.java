package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import RMWPages.CheckTrackOrderPage;

public class CheckOrderPageTest extends RMWBaseClass {
	@Test
	public void CheckOrderData() throws InterruptedException, FilloException {
		Recordset recordset = connection.executeQuery("select * from data where TestName='test3'");
		recordset.next();
		
		String Username = recordset.getField("UserName");
		String OrderNo = recordset.getField("OrderNo");
		
		CheckTrackOrderPage Track = new CheckTrackOrderPage(driver);
		Track.CheckOrderFunction(OrderNo, Username);
		
		String ActualURL= driver.getCurrentUrl();
		String ExpURL = "https://www.rmwilliams.com/on/demandware.store/Sites-rmwUS-Site/en_US/Order-DetailTracking";
		Assert.assertEquals(ActualURL, ExpURL);
	}

	

}
