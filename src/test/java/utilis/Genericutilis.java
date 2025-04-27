 package utilis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genericutilis {
	WebDriver driver;
	public Genericutilis(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Switchtochildwindow() {
		  Set<String> it = driver.getWindowHandles();
		  Iterator<String> i1=it.iterator();
		  String parentwindow=i1.next();
		  String childwindow=i1.next();
		  driver.switchTo().window(childwindow);
		
	}

}
