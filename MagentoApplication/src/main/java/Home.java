
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	  WebDriver driver;
	  By myacc=By.linkText("My Account");    //instance variables for locators
	  
public Home(WebDriver driver)
	{
		this.driver=driver;
	}
public void clickOnMyacc()           //methods for action or data

{
	driver.findElement(myacc).click();
}
}
