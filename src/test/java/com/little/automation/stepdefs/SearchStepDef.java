package com.little.automation.stepdefs;

import com.little.automation.configuration.ApplicationProperties;
import com.little.automation.poms.SearchPom;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchStepDef extends AbstractStepDef {

    private static final Logger LOG = LoggerFactory.getLogger(SearchStepDef.class);

    private SearchPom searchPom;

    public SearchStepDef(WebDriver webDriver, ApplicationProperties applicationProperties,
                         SearchPom searchPom) {
        super(webDriver, applicationProperties);
        this.searchPom = searchPom;
    }

    @Then("Enter {string} in search box")
    public void enterTextInSearchBox(String text) {
        searchPom.enterSearchText(text);
        wait(5);
    }
}
