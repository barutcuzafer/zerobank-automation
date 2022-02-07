package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css=".icon-signin")
    public WebElement signInButton;

    @FindBy(id="user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(css=".btn.btn-primary")
    public WebElement getSignInButtonToSubmit;

    public void login(){
        signInButton.click();
        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        getSignInButtonToSubmit.click();

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();

    }


}
