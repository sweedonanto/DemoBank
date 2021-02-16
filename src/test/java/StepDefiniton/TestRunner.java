package StepDefiniton;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
glue= {"StepDefiniton"},
monochrome=true,
plugin = {"pretty", "html:target/GuruBank"})
public class TestRunner {

}
