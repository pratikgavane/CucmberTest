package Steps;

import Locators.FBloginLocators;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Login extends BaseClass{
	//WebDriver driver;
	FBloginLocators fbl;
	@Given("^user launch the apllication$")
	public void launchurl(){
		
		fbl=new FBloginLocators(driver);
		driver.get("https://www.facebook.com/");
		System.out.println("Browser Invoked");
		
	}
	@When("^user enter valid userName \"([^\"]*)\"$")
	public void enterUSername(String userName){
		//System.out.println(pratik.gavane@gmail.com);
		System.out.println(userName);
		fbl.username.sendKeys(userName);
	}
	@When("^user enter valid password \"([^\"]*)\"$")
	public void sendloginpassword(String Password){
		fbl.password.sendKeys(Password);
	}
	@When("^user clicked on the login button$")
	public void onClick(){
		fbl.submit.click();
	}
	@Then("^user is on the home page of the application$")
		public void isElementPresent(){
			if(fbl.Homebtn.isDisplayed()){
				System.out.println("User is on the Home Page");
			}
			
		}
	
}
