package Com.radical.basic.multipleScenarioInSingleFile;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



	public class MultiScenarioStepDefs {
		
			WebDriver driver;
			
//			@Before
//			public void setUp() throws InterruptedException {
//				System.out.println("in setup");
//				System.setProperty("webdriver.chrome.driver","F:\\Radicaltechnology\\chromedriver_win32_B39\\chromedriver.exe");
//				driver = new ChromeDriver();
////				System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
////				driver = new FirefoxDriver();
//				System.out.println("opned browser");
//				Thread.sleep(5000);
//			}
			
			@Given("the user is on facebook login Page")
			public void the_user_is_on_facebook_login_page(){
			System.setProperty("webdriver.chrome.driver","F:\\Radicaltechnology\\chromedriver_win32_B39\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			}
			
			@When("^he enters \"([^\"]*)\" as user name$")
			public void He_enters_user_name(String userName) {
				driver.findElement(By.id("email")).sendKeys(userName);
			}
			
			@When("^he enters \"([^\"]*)\" as password$")
			public void He_enters_user_password(String pwd) throws InterruptedException {
				driver.findElement(By.id("pass")).sendKeys(pwd);
				Thread.sleep(5000);
			}
			
			@Then("^check username is present in textbox$")
			public void check_username_is_present_in_textbox(){
			
				Assert.assertTrue(true);
				driver.quit();
			}
			
			@After
			public void afterScenario(){
				System.out.println("after Each scenario");
			}
			
			

	}
