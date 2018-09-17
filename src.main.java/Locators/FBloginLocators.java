package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginLocators {
	WebDriver driver;
	public FBloginLocators(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='pass']")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement Homebtn;
	
	@FindBy(xpath="//div[@id='userNavigationLabel']")
	public WebElement managebtn;
}
