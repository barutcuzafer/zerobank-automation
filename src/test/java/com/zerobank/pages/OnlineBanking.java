package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBanking extends BasePage{


    @FindBy(xpath = "//span[.='Account Summary']")
    public WebElement accountSummary;

    public void clickOnAccountSummary(){
        accountSummary.click();
    }




}
