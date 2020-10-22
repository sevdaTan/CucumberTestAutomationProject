package com.vytrack.step_definitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {
// Hook Before == @BeforeMethod in TestNG
// Hook After == @AfterMethod in TestNG
// Hooks triggered based on tags, not class name or their location
 // It is not a good idea to mix implicit and explicit waits. It can lead to unexpectedly long waits.
 // usually we are using explicit and fluent wait

    @Before
    public void  setup(){
        System.out.println("::: Starting Automation :::");
   Driver.getDriver().manage().window().maximize();
   Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /**
     * @db Scenario: I don't know but here I'm connecting to DB
     * Given user runs following query "SELECT * ...."
     * <p>
     * order = 0 - to define hooks execution order
     */

   @Before(value = "@db",order = 0) // this hook will run only before scenarios with a tag @db
    public void dbsetup(){
        System.out.println("::: Connecting the database :::");
    }


    @After("@db") // this hook will run only after scenarios with a tag @db
    public void dbTeardown(){
        System.out.println("::: Disconnecting the database :::");
    }



    @After
    public void teardown(){
        // this is a hook After
        // runs automatically after every test
        Driver.closeDriver();
        System.out.println(":::(^_^) End of test execution (*_*):::");
    }


}
