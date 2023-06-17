package com.little.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractPom {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractPom.class);

    protected WebDriver webDriver;

    public AbstractPom(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
