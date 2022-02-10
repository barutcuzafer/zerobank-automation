package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.OnlineBanking;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityDefinitionsSteps {

    @When("the user clicks on {string} link on the Account Summary page")
    public void theUserClicksOnLinkOnTheAccountSummaryPage(String accountType) {
        OnlineBanking onlineBanking=new OnlineBanking();
        onlineBanking.clickOnAccountSummary();

        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.clickOnAccountTypes(accountType);


    }

    @Then("the Account Activity page should be displayed")
    public void theAccountActivityPageShouldBeDisplayed() {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        String expected="Account Activity";
        String actual=accountActivityPage.checkTitle().split("- ")[1];
        Assert.assertEquals(expected,actual);
        System.out.println("actual = " + actual);


    }


    @And("Account drop down should have {string} selected")
    public void accountDropDownShouldHaveSelected(String firstSelection) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        String actual= accountActivityPage.checkDropDown();
        Assert.assertEquals(firstSelection,actual);
        System.out.println("actual = " + actual);


    }
}
