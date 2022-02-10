package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{

    @FindBy(linkText = "Savings")
    public WebElement savings;

    @FindBy(linkText = "Brokerage")
    public WebElement brokerage;

    @FindBy(linkText = "Checking")
    public WebElement checking;

    @FindBy(linkText = "Credit Card")
    public WebElement creditCard;

    @FindBy(linkText = "Loan")
    public WebElement loan;

    @FindBy(linkText = "Account Activity")
    public WebElement accountActivity;



    public void clickOnAccountTypes(String accountType){

        switch (accountType){
            case "Savings":
                savings.click();
                break;
            case "Brokerage":
                brokerage.click();
            case "Checking":
                checking.click();
                break;
            case "Credit Card":
                creditCard.click();
                break;
            case "Loan":
                loan.click();
                break;
        }





    }

}
