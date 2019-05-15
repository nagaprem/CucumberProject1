package com.greensTech;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class addCustomer {
	static WebDriver driver;
	
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/telecom/");
	    driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	    
	}

	@When("The user fill in the valid customer details")
	public void the_user_fill_in_the_valid_customer_details(DataTable CustomerDetails) {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	Map<String,String> customerMap=CustomerDetails.asMap(String.class, String.class);
	driver.findElement(By.id("fname")).sendKeys(customerMap.get("firstName"));
	driver.findElement(By.id("lname")).sendKeys(customerMap.get("lastName"));
	driver.findElement(By.id("email")).sendKeys(customerMap.get("email"));
	driver.findElement(By.name("addr")).sendKeys(customerMap.get("address"));
	driver.findElement(By.name("telephoneno")).sendKeys(customerMap.get("phoneNo"));
	}

	@When("The user click the Submit button")
	public void the_user_click_the_Submit_button() {
	  driver.findElement(By.name("submit")).click();
	}

@When("The user click the Reset button")
public void the_user_click_the_Reset_button() {
    driver.findElement(By.xpath("//input[@value='Reset']")).click();
    
 }


@Then("The user should see the Alert Message")
public void the_user_should_see_the_Alert_Message() throws InterruptedException {
// Switching to Alert
  Alert alert = driver.switchTo().alert();
//Capturing alert message. 
  String alertMsg=driver.switchTo().alert().getText();
// Displaying alert message in Console
  System.out.println(alertMsg);
  Thread.sleep(5000);
// Accepting alert
  alert.accept();
}

@Then("The user should see the form cleare")
public void the_user_should_see_the_form_cleare() {
 Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
}
	@Then("The user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
	  Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	  
}
	
	@Given("The User is in Add Tariff Plan Page")
	public void the_User_is_in_Add_Tariff_Plan_Page() {
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/telecom/");
		    driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The User Fill in the Valid plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_User_Fill_in_the_Valid_plan_details(String MonthRent, String FreeLocMins, String FreeIntMins, String FreeSMS, String LocMinsCharges, String IntMinsCharges, String SMSCharges) {
	 driver.findElement(By.id("rental1")).sendKeys(MonthRent);
	 driver.findElement(By.id("local_minutes")).sendKeys(FreeLocMins);
	 driver.findElement(By.id("inter_minutes")).sendKeys(FreeIntMins);
	 driver.findElement(By.id("sms_pack")).sendKeys(FreeSMS);
	 driver.findElement(By.id("minutes_charges")).sendKeys(LocMinsCharges);
	 driver.findElement(By.id("inter_charges")).sendKeys(IntMinsCharges);
	 driver.findElement(By.id("sms_charges")).sendKeys(SMSCharges);
	}

	//@When("The user click the Submit button")
	//public void the_user_click_the_Submit_button() {
	//  driver.findElement(By.name("submit")).click();
	//}
	
// Reset Tarff Plan Details
@When("The user fill in the Tarff Plan details")
public void the_user_fill_in_the_Tarff_Plan_details(DataTable TarffPlan) throws InterruptedException {
	Map<String,String> TarffPlanMap=TarffPlan.asMap(String.class, String.class);
	driver.findElement(By.id("rental1")).sendKeys(TarffPlanMap.get("MonthRent"));
	 driver.findElement(By.id("local_minutes")).sendKeys(TarffPlanMap.get("FreeLocMins"));
	 driver.findElement(By.id("inter_minutes")).sendKeys(TarffPlanMap.get("FreeIntMins"));
	 driver.findElement(By.id("sms_pack")).sendKeys(TarffPlanMap.get("FreeSMS"));
	 driver.findElement(By.id("minutes_charges")).sendKeys(TarffPlanMap.get("LocMinsCharges"));
	 driver.findElement(By.id("inter_charges")).sendKeys(TarffPlanMap.get("IntMinsCharges"));
	 driver.findElement(By.id("sms_charges")).sendKeys(TarffPlanMap.get("SMSCharges"));
	 Thread.sleep(2000);
}

// Reset Tariff Plan Sucess
@Then("The user should see the Tarff Plan form cleare")
public void the_user_should_see_the_Tarff_Plan_form_cleare() throws InterruptedException {
    Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
    Thread.sleep(2000);
    driver.quit();
}

//Add Tariff Plan Sucess
	@Then("The User Should See the Sucess Message")
	public void the_User_Should_See_the_Sucess_Message() {
	    Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	    driver.quit();
	}

// Alert Msg Tariff Plan Page 	
	@Then("The user should see the Alert Message in Tariff Plan Page")
	public void the_user_should_see_the_Alert_Message_in_Tariff_Plan_Page() throws InterruptedException {
		// Switching to Alert
		  Alert alert = driver.switchTo().alert();
		//Capturing alert message. 
		  String alertMsg=driver.switchTo().alert().getText();
		// Displaying alert message in Console
		  System.out.println(alertMsg);
		  Thread.sleep(3000);
		// Accepting alert
		  alert.accept();
		  driver.quit();
	}

}