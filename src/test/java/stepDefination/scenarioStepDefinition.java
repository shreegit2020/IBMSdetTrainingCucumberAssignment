package stepDefination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenarioStepDefinition {
	
	WebDriver driver = new ChromeDriver();
	List<String> bmiResultList = new ArrayList<String>(); 
	
	@Given("^Calculator net page is open$")
	public void calculator_net_page_is_open() throws Throwable {
		// launch Calculator net page
				try {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\ShreelaxmiBose\\Desktop\\SDET\\Automation\\SDETCucumberAutomation\\chromedriver.exe");
					
					driver.get("https://www.calculator.net/");
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					Thread.sleep(500);
					String actualTitle = driver.getTitle();
					System.out.println(actualTitle);
					String expectedTitle = "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
					if(actualTitle.equalsIgnoreCase(expectedTitle))
					{
						System.out.println("Title matched");
					}
					else 
						System.out.println("Title mismatch");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@When("^user click on BMICalculator link$")
	public void user_click_on_BMICalculator_link() throws Throwable {
		try {
			driver.findElement(By.xpath("//a[contains(text(),'BMI Calculator')]")).click();
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^BMICalculator page opened successfully$")
	public void bmicalculator_page_opened_successfully() throws Throwable {
		try {
			String bmiCalcTitle = driver.getTitle();
			String expectedBMITitle = "BMI Calculator";
			if(bmiCalcTitle.equalsIgnoreCase(expectedBMITitle))
			{
				System.out.println("BMI Calculator page title is : "+ bmiCalcTitle);
			}
			else {
				System.out.println("Incorrect BMI calculator page Title : "+bmiCalcTitle);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^we enter value as DataTable and calculate BMI$")
	public void we_enter_value_as_DataTable_and_calculate_BMI(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		try {
			// Handling Data table data
			List<List<String>> data = arg1.raw();
			
			for (int i =0; i<data.size(); i++)
			{
				// entering data to Age,height and weight (First row + First column)
				clearData();
				driver.findElement(By.xpath("//input[@id='cage']")).sendKeys(data.get(i).get(0));
				driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys(data.get(i).get(1));
				driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys(data.get(i).get(2));
				
				driver.findElement(By.xpath("//input[@value='Calculate']")).click();
				Thread.sleep(500);
				
				// calculate BMI
				String strBMIvalue = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
				System.out.println("BMI Result of Person "+ i +": "+strBMIvalue);
				bmiResultList.add(i, strBMIvalue);
			}
			
			System.out.println(bmiResultList);
			
			/* Display content using Iterator
		      Iterator<String> iterator = bmiresult.iterator();
		      while(iterator.hasNext()) {
		    	  String strBMI = iterator.next();
		          System.out.println("List of BMI Result:" + strBMI);
		      }*/
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void clearData() {
		try {
			driver.findElement(By.xpath("//input[@id='cage']")).clear();
			driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
			driver.findElement(By.xpath("//input[@id='ckg']")).clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		// Quite browser
		try {
			
				driver.quit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	
}
