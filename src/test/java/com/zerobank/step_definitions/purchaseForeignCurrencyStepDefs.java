package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class purchaseForeignCurrencyStepDefs {

    AccountActivityPage accountActivityPage=new AccountActivityPage();
    PayBillsPage payBillsPage=new PayBillsPage();
    @And("the user accesses the Purchase foreign currency cash tab")
    public void theUserAccessesThePurchaseForeignCurrencyCashTab() {
        accountActivityPage.clickpayBills();
        payBillsPage.clickOnpurchaseForeignCurrency();
    }

    @Then("following currencies should be available")
    public void followingCurrenciesShouldBeAvailable(List<String> currencies) {
        Assert.assertTrue(payBillsPage.areCurrenciesAvailable(currencies));

    }

    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        BrowserUtils.waitFor(2);
       payBillsPage.tryWithoutCurrency();


        
    }


    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        Assert.assertTrue(payBillsPage.isAlertMessageDisplayed());
    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        BrowserUtils.waitFor(2);
        payBillsPage.tryWithoutAmount();


    }
}
