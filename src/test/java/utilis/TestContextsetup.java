package utilis;

import org.openqa.selenium.WebDriver;

import pageobject.Pageobjectmanager;

public class TestContextsetup {

	
		public WebDriver driver;
		public String landingPage;
		public Pageobjectmanager pageobjectmanager;
		public Testbase testbase;
		public Genericutilis genericutilis;
		public TestContextsetup() {
			testbase = new Testbase();
			pageobjectmanager =new Pageobjectmanager(testbase.WebDriverManager());
			genericutilis=new Genericutilis(testbase.WebDriverManager());
		}

	

}
