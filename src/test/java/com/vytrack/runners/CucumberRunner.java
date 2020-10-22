package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // copy path -> features content root
        glue = "com/vytrack/step_definitions", // copy path -> step_definitions source root
        dryRun = false,
//       tags = "@parametrized_test"
     //   tags = "@negative_login or @parametrized_test", // we can run more than one scenarios at the same time
        tags = "@login",
        publish = true
)

public class CucumberRunner {



}
