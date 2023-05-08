package RMWPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver Pagedriver;
	
	// ===========Objects of Search Function========================//
	
	@FindBy(xpath="//div[@aria-label='Search']")
	WebElement SearchIconCTA;
	
	@FindBy(xpath="//input[@id='search-result-count']")
	WebElement SearchInputTxt;
	
	@FindBy(xpath="//button[@name='search-button']")
	WebElement searchButtonCTA;
	
	public SearchPage(WebDriver driver) {
		Pagedriver = driver;
		PageFactory.initElements(Pagedriver, this);

	}
	
	public void SearchFunction (String searchdataVal) {
		//WebElement SearchIconCTA = driver.findElement(By.xpath("//div[@aria-label='Search']"));
		SearchIconCTA.click();
		
		//WebElement SearchInputTxt = driver.findElement(By.xpath("//input[@id='search-result-count']"));
		SearchInputTxt.sendKeys(searchdataVal);
		
		//WebElement searchButtonCTA = driver.findElement(By.xpath("//button[@name='search-button']"));
		searchButtonCTA.click();
		
	}

}
