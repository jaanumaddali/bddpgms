package bddpgm;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featuretags",glue= {"bddpgm"},tags="@run")
public class testrunner1 {

}
