package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class searchFunctionTest extends RMWBaseClass {
	
	@Test
	
	public void SearchFunctionData() {
		SearchFunction("Boots");
	}
	

	
	public void SearchFunction (String searchdataVal) {
		WebElement SearchIconCTA = driver.findElement(By.xpath("//div[@aria-label='Search']"));
		SearchIconCTA.click();
		
		WebElement SearchInputTxt = driver.findElement(By.xpath("//input[@id='search-result-count']"));
		SearchInputTxt.sendKeys(searchdataVal);
		
		WebElement searchButtonCTA = driver.findElement(By.xpath("//button[@name='search-button']"));
		searchButtonCTA.click();
		
	}
}
