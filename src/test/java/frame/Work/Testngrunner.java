package frame.Work;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/fet",
glue="stepdefinition",monochrome=true)

public class Testngrunner extends AbstractTestNGCucumberTests {



}
