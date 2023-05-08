package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import RMWPages.SearchPage;

public class searchFunctionTest extends RMWBaseClass {
	
	@Test
	public void SearchFunctionData() throws FilloException {
		
		Recordset recordset = connection.executeQuery("select * from data where TestName='ValidSearch'");
		recordset.next();
		
		String SearchData = recordset.getField("SearchData");
		
		SearchPage search = new SearchPage(driver);
		search.SearchFunction(SearchData);
		
		
		String ActualURL= driver.getCurrentUrl();
		String ExpUrl = "https://www.rmwilliams.com/Search?q="+SearchData+"&lang=en_US";
		Assert.assertEquals(ActualURL, ExpUrl);
	}
	
	@Test
	public void InvalidSearch() throws FilloException {
		Recordset recordset = connection.executeQuery("select * from data where TestName='InvalidSearch'");
		recordset.next();
		
		String SearchData = recordset.getField("SearchData");
		
		SearchPage search = new SearchPage(driver);
		search.SearchFunction(SearchData);
		
		String ActualURL= driver.getCurrentUrl();
		String ExpUrl = "https://www.rmwilliams.com/Search?q="+SearchData+"&lang=en_US";
		Assert.assertEquals(ActualURL, ExpUrl);
	}
	

	
	
}
