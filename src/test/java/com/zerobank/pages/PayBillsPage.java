package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayee;

    public void clickOnAddNewPayee(){
        addNewPayee.click();
    }

}
