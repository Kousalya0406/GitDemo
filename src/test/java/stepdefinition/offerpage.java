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
import pageobject.Offerobject;
import pageobject.Pageobjectmanager;
import utilis.TestContextsetup;

public class offerpage {
	
	public String offerpage;
TestContextsetup testcontextsetup;
Pageobjectmanager pageobjectmanager;
	
	public offerpage (TestContextsetup testcontextsetup) {
		this.testcontextsetup= testcontextsetup;
		
	}

	@Then("User searched for same {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
		
		  switchTofferpage();
		  
		  Offerobject offer=testcontextsetup.pageobjectmanager.Offerobject();
		  offer.searchitem(shortname);
		  Thread.sleep(1000);
		  
		   offerpage=offer.getproductname();
		  
		  
	}
	public void switchTofferpage() throws InterruptedException {
		//pageobjectmanager = new Pageobjectmanager(testcontextsetup.driver);
		Landingobject landing=testcontextsetup.pageobjectmanager.getLandingobject();
		//Thread.sleep(1000);
		landing.topdealspage();
		testcontextsetup.genericutilis.Switchtochildwindow();
	}

@Then("validating the both page")
public void validating_the_both_page() throws InterruptedException {
//	
//	Thread.sleep(1000);
  Assert.assertEquals(testcontextsetup.landingPage,offerpage);
	//System.out.println("kousi");
}


}
