package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="homeMenu")
    protected WebElement home;

    @FindBy(id="onlineBankingMenu")
    protected WebElement onlineBanking;

    @FindBy(id="feedback")
    protected WebElement feedback;
}
