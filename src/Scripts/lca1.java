package Scripts;
import org.testng.annotations.Test;
import Generic.baseTest;
import POM.actitime_login3;
public class lca1 extends baseTest {
@Test
public void loginscript()
{
	actitime_login3 ob=new actitime_login3(driver);
	ob.setusername("admin");
	ob.setpassword("manager");
	ob.clicklogin();
	ob.titleWait("actiTIME - Enter Time-Track");
}
}
