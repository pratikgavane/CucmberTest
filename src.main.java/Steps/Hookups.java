package Steps;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookups extends  BaseClass{
@Before
public void initialize(){
	System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("initialize hookups ");

}

@After
public void cleanup(){
	System.out.println("print cleanup");
	driver.close();

}

}
