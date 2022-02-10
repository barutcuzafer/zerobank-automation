package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.Month;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    public WebElement drop;

    Select dropDown=new Select(drop);
    public String  checkDropDown(){
        return dropDown.getFirstSelectedOption().getText();
    }

    public String checkTitle(){
        return Driver.getDriver().getTitle();
    }


    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsButton;

    public void clickFindTransactions(){
      findTransactionsButton.click();
    }

    @FindBy(id = "aa_fromDate")
    public WebElement fromDate;
    @FindBy(id = "aa_toDate")
    public WebElement toDate;
    @FindBy(css = ".btn.btn-primary")
    public WebElement findButton;




















}
