package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//div[@class='sc-htmcrh ditdwV']/following-sibling::span/child::a[1]")
    WebElement loginLink;

    public void clickOnLoginLing(){
        clickOnElement(loginLink);
        log.info("Clickin on login link :"+ loginLink.toString());
    }
}
