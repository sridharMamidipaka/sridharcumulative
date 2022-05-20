package Testrunner;


import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\H_7\\Desktop\\ca\\hybcum\\features",
glue="stepdefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:report/report.html"})

public class runner {
	
}
