package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(css=".btn.btn-primary")
    public WebElement submitButton;

    public void login(){//login with constant credentials
        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submitButton.click();
        //Due to SSL problem making these steps
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();

    }
    @FindBy(id="homeMenu")
    public WebElement home;

    @FindBy(id="onlineBankingMenu")
    public WebElement onlineBanking;

    @FindBy(id="feedback")
    public WebElement feedback;

    public void clickOnOnlineBanking(){
        onlineBanking.click();
    }

}

