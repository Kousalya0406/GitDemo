package utilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public WebDriver driver;
	public WebDriver WebDriverManager() {
		if(driver == null) {
		driver = new ChromeDriver();
	    
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
	    return driver;
		
	}

}
