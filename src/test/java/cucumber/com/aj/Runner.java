package cucumber.com.aj;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue={"stepdefinations"},dryRun=true,plugin= 
{"html:target/cucumber-reports/cucumber-html-report.html"})
public class Runner extends AbstractTestNGCucumberTests {

}
