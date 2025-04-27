package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingobject {
	public WebDriver driver;
	public Landingobject(WebDriver driver) {
		this.driver=driver;
		
	}
	By search=By.xpath("//input[@type='search']");
	By productname=By.xpath("//h4[@class='product-name']");
	By topdeals=By.linkText("Top Deals");
	
	public void searchitem (String name) {
		 driver.findElement(search).sendKeys(name);
	}
	public void gettext () {
		 driver.findElement(search).getText();
	}
	public String getproductname () {
		 return driver.findElement(productname).getText();
	}
	public void topdealspage() {
		
		
		
		
		driver.findElement(topdeals).click();
	}
	

}
