package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.BaseClass;

public class LoginTestCase extends BaseClass
{
	@Test
	public void verify_account_registration() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		logger.error("Error");
		
		logger.debug("Debug ");
		
		Thread.sleep(5000);
		hp.clickMyAccount();
		Thread.sleep(5000);
		hp.clickLogin();
		Thread.sleep(6000);
		hp.loginAccount("gautam@gmail.com", "gautam@1234");
	}

}
