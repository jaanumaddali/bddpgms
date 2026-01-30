package bddpgm;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",glue= {"bddpgm"},monochrome=true
,plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports.xml"})
public class testrunner {

}
