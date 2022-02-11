package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class addNewPayeeDefinitionsStep {


    PayBillsPage payBillsPage=new PayBillsPage();

    @Given("Add New Payee tab")
    public void addNewPayeeTab() {
        new AccountActivityPage().clickpayBills();
        payBillsPage.clickOnAddNewPayee();
    }

    @And("creates new payee using following information")
    public void createsNewPayeeUsingFollowingInformation(Map<String,String> payeeInfo) {
        payBillsPage.createNewPayee(payeeInfo);

    }
    @Then("message {string} should be displayed")
    public void messageShouldBeDisplayed(String expectedMessage) {
        Assert.assertTrue(payBillsPage.isMessageDisplayedAccurately(expectedMessage));
    }
}
