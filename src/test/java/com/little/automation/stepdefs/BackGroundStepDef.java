package com.little.automation.stepdefs;

import com.little.automation.configuration.ApplicationProperties;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BackGroundStepDef extends AbstractStepDef{

    private static final Logger LOG = LoggerFactory.getLogger(BackGroundStepDef.class);

    public BackGroundStepDef(WebDriver webDriver, ApplicationProperties applicationProperties) {
        super(webDriver, applicationProperties);
    }

    @Given("Open browser")
    public void openBrowser() {
        LOG.info("open browser");
        webDriver.get(applicationProperties.getApplicationUrl());
    }
}
