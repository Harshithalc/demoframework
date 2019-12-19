package Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
public class Basepage {
	WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void titleWait(String exp_title)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleIs(exp_title));
			Reporter.log("pass:title is matching", true);
		}
		catch (Exception e) {
			Reporter.log("fail:title is not matching", true);
			Assert.fail();
		}
	}
}
