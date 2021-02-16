package StepDefiniton;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;



public class LoginGuruBank {
	
	  WebDriver driver= null;
	  
	  @Given("browser is open") public void browser_is_open() {
	  
	  
	  System.out.println("Inside Step- user open the browser");
	  
	  String projectPath=System.getProperty("user.dir");
	  System.out.println("Project path is: " +projectPath);
	  
	  System.setProperty("webdriver.chrome.driver",projectPath+
	  "/src/test/resources/drivers/chromedriver.exe"); driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); 
	  }
	  
	  @And("user is on login page") public void use_is_on_login_page() {
	  driver.navigate().to("http://demo.guru99.com/V4/");
	  
	  
	  
	  }
	  
	  @When("^user enters (.*) and (.*)$") public void
	  user_enters_username_and_password(String username, String password) throws
	  InterruptedException {
	  driver.findElement(By.name("uid")).sendKeys(username);;
	  driver.findElement(By.name("password")).sendKeys(password);
	  Thread.sleep(4000);
	  
	  }
	  
	  @And("user clicks on login button") public void user_clicks_on_login_button()
	  { driver.findElement(By.name("btnLogin")).click(); }
	  
	  @Then("user is navigate to the home page") public void
	  user_is_navigate_to_the_home_page() {
		  driver.navigate().to("http://demo.guru99.com/V4/index.php");
		 
			/*
			 * File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 * FileUtils.copyFile(s, new File("tutorialpoint.png"));
			 */
		  
	  driver.close(); driver.quit();
	  }
	 
	
}
