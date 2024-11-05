package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement linkmyaccount;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
WebElement linkLogin;

public void clickMyAccount()
{
	linkmyaccount.click();
}
	
public void clickLogin()    
{
	linkLogin.click();
}
//--------------------------------------------------

@FindBy(xpath = "//input[@id='input-email']")
WebElement txtEmailAddress;

@FindBy(xpath = "//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath = "//input[@value='Login']")
WebElement btnLogin;


public void loginAccount(String emailid,String password)
{
	txtEmailAddress.sendKeys(emailid);
	txtPassword.sendKeys(password);
	
	btnLogin.click();
	
	
}










}



