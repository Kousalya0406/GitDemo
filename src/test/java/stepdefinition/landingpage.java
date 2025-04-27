package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Landingobject;
import utilis.TestContextsetup;

public class landingpage {
	public String landingPage;
	
	TestContextsetup testcontextsetup;
	
	public landingpage (TestContextsetup testcontextsetup) {
		this.testcontextsetup= testcontextsetup;
		
	}
	@Given("User is on Greenkart Landing page")
	public void user_is_on_greenkart_landing_page() throws InterruptedException {
	   
	}
	@When("User searched with Shortname {string} and extracted name of product")
	public void user_searched_with_shortname_and_extracted_name_of_product(String Shortname) throws InterruptedException {
		Landingobject landing=testcontextsetup.pageobjectmanager.getLandingobject();
		landing.searchitem(Shortname);
		//testcontextsetup. driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Shortname);
	    Thread.sleep(1000);
	    testcontextsetup.landingPage=landing.getproductname().split("-")[0].trim();
	   System.out.println(testcontextsetup.landingPage+ " is extracted from home page");
	}

	


}
