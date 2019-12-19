package Generic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class baseTest implements AutoConstant{
	public WebDriver driver;
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
	@BeforeMethod
	public void precond()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void postcond()
	{
		driver.close();
	}
}
