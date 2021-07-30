package com.virgingames;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucumber.json"},
        tags = " @Smoke,@Sanity,@Regression"
)

public class CukeTest {

    @AfterClass
    public static void setUp(){
        String projectpath = System.getProperty("user.dir");
        String reportConfigPath = projectpath+"/src/test/java/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name",System.getProperty("User.name"));
        Reporter.setSystemInfo("Time Zone",System.getProperty("User.timezone"));
        Reporter.setSystemInfo("Machine","Windows 10 "+"64 Bit");
        Reporter.setSystemInfo("Selenium","3.141.59");
        Reporter.setSystemInfo("Maven","3.5.9");
        Reporter.setSystemInfo("Java","1.8.0_151");

    }
}
