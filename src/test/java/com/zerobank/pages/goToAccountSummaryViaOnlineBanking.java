package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class goToAccountSummaryViaOnlineBanking extends BasePage{

    @FindBy(id="account_summary_link")
    public WebElement accountSummary;
    public void onlineBankingAndAccountSummary(){//After logged in, first click on Online Banking from BasePage then Click on Account Summary on new page
        onlineBanking.click();
        accountSummary.click();
    }




}
