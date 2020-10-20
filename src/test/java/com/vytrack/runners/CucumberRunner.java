package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature", // copy path -> content root
        glue = "com/vytrack/step_definitions", // copy path -> source root
        dryRun = false
)

public class CucumberRunner {



}
