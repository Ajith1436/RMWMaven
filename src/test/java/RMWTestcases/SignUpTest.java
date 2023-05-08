package RMWTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import RMWPages.SignUpPage;

public class SignUpTest extends RMWBaseClass {

	//@Test
	public void Signupdata() throws InterruptedException, FilloException {

		Recordset recordset = connection.executeQuery("select * from data where TestName='NewUser8'");
		recordset.next();

		String FirstName = recordset.getField("FirstName");
		String LastName = recordset.getField("LastName");
		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");
		String DayVal = recordset.getField("DayVal");
		String MonthVal = recordset.getField("MonthVal");
		String YearVal = recordset.getField("YearVal");

		SignUpPage Signup = new SignUpPage(driver);
		Signup.SignUpFunction(FirstName, LastName, UserName, Password,DayVal,MonthVal,YearVal);
		//Signup.CongratulationsPage(DayVal,MonthVal,YearVal);
		

		/*WebElement welcomeMsg = driver.findElement(By.xpath("//span[@class='subtitle']"));
		String ActualText = welcomeMsg.getText();
		String ExpText = "Welcome to your account";
		Assert.assertEquals(ActualText, ExpText);
		*/

	}
}
