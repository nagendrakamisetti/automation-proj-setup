package com.little.automation.poms;

import com.little.automation.stepdefs.BackGroundStepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class SearchPom extends AbstractPom {

    private static final Logger LOG = LoggerFactory.getLogger(SearchPom.class);

    public SearchPom(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div/textarea")
    public WebElement searchBox;

    public void enterSearchText(String text) {
        searchBox.sendKeys(text);
    }

}
