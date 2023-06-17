package com.little.automation.stepdefs;

import com.little.automation.SpringContextConfiguration;
import com.little.automation.configuration.ApplicationProperties;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {SpringContextConfiguration.class})
public class Hooks extends AbstractStepDef {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class);

    public Hooks(WebDriver webDriver, ApplicationProperties applicationProperties) {
        super(webDriver, applicationProperties);
    }

    @Before
    public void openBrowser() {

    }

    @After
    public void closeBrowser() {
        webDriver.quit();
    }
}
