package pageobject;

import org.openqa.selenium.WebDriver;

import utilis.Genericutilis;
import utilis.Testbase;

public class Pageobjectmanager {
	public Landingobject landingobject;
	public WebDriver driver;
	public Offerobject offerobject;
	
	
	public Pageobjectmanager(WebDriver driver) {
		this.driver=driver;
	}
	
	public Landingobject getLandingobject()
	{
		landingobject= new Landingobject(driver);
		return landingobject;
	}
	public  Offerobject Offerobject()
	{
		offerobject= new Offerobject(driver);
		return offerobject;
	}
	

}
