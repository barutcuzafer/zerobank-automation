package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Given;

public class addNewPayeeDefinitionsStep {


    PayBillsPage payBillsPage=new PayBillsPage();

    @Given("Add New Payee tab")
    public void addNewPayeeTab() {
        new AccountActivityPage().clickpayBills();
        payBillsPage.clickOnAddNewPayee();
    }
}
