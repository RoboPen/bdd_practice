package org.course;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org/course/steps"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
