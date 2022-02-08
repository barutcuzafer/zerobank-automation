package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage {

   WebElement drop=Driver.getDriver().findElement(By.id("aa_accountId"));

    Select dropDown=new Select(drop);

    public String checkDropDown(){
        return dropDown.getFirstSelectedOption().getText();

    }

    public String checkTitle(){
        return Driver.getDriver().getTitle();
    }






}
