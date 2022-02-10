package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineBanking extends BasePage{


    @FindBy(xpath = "//span[.='Account Summary']")
    public WebElement accountSummary;
    public void clickOnAccountSummary(){
        accountSummary.click();
    }

    @FindBy(id = "account_activity_link")
    public WebElement accountActivity;
    public void clickOnAccountActivity(){
        BrowserUtils.waitFor(2);
        accountActivity.click();}




}
