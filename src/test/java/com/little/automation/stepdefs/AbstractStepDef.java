package com.little.automation.stepdefs;

import com.little.automation.configuration.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class AbstractStepDef {

    private static final Logger LOG = LoggerFactory.getLogger(BackGroundStepDef.class);

    WebDriver webDriver;
    ApplicationProperties applicationProperties;

    public AbstractStepDef(WebDriver webDriver, ApplicationProperties applicationProperties) {
        this.webDriver = webDriver;
        this.applicationProperties = applicationProperties;
    }

    void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            LOG.error("wait failed", e);
        }
    }
}
