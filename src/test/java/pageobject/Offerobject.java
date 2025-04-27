package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerobject {
	public WebDriver driver;
	public Offerobject(WebDriver driver) {
		this.driver=driver;
		
	}
	By search=By.xpath("//input[@type='search']");
	By productname=By.xpath("//table//tbody//tr//td[1]");
	
	public void searchitem (String name) {
		 driver.findElement(search).sendKeys(name);
	}
	public void gettext () {
		 driver.findElement(search).getText();
	}
	public String getproductname () {
		 return driver.findElement(productname).getText();
	}
	

}