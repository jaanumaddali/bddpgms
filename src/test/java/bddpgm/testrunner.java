package bddpgm;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/first.feature",glue= {"bddpgm"},monochrome=true
,plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"})
public class testrunner extends AbstractTestNGCucumberTests {

}
