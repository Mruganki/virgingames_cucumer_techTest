package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//input[@id='field-username']")
    WebElement userNameField;

    @FindBy(xpath = "//input[@id='field-password']")
    WebElement passWordField;

    @FindBy(xpath = "//button[@class='button button-login']")
    WebElement loginbutton;

    @FindBy(xpath = "//div[@class='output']")
    WebElement errorMessage;




    public void enterUserName(String userName){
       sendTextToElement(userNameField, userName);
       log.info("Enter Username in username Field :"+ userNameField.toString());

    }

    public void enterPassword(String passWord){
        sendTextToElement(passWordField,passWord);
        log.info("Enter Password in password Field :"+ passWordField.toString());

    }
    public void clickOnLoginButton(){
        clickOnElement(loginbutton);
        log.info("Clickin on login Button :"+ loginbutton.toString());
    }

    public String getErrorMessage(){

        log.info("Getting Error Message text :"+ errorMessage.toString());
        return getTextFromElement(errorMessage);
    }




}
