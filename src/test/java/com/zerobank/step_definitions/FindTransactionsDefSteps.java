package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBanking;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.util.List;

public class FindTransactionsDefSteps {

   AccountActivityPage accountActivityPage=new AccountActivityPage();


    @Given("the user accesses the Find Transactions tab")
    public void theUserAccessesTheFindTransactionsTab()  {
       accountActivityPage.clickFindTransactions();
    }


    @When("the user enters date range from “{string}” to “{string}”")
    public void theUserEntersDateRangeFromTo(String fromDate, String toDate) {
      accountActivityPage.sendKeys(fromDate,toDate);



    }

    @And("clicks search")
    public void clicksSearch() {
        accountActivityPage.clickFind();

    }


    @Then("results table should only show transactions dates between “{string}” to “{string}”")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo(String fromDate, String toDate) throws ParseException, InterruptedException {
        Assert.assertTrue(accountActivityPage.betweenDates(fromDate,toDate));
    }

    @And("the results should be sorted by most recent date")
    public void theResultsShouldBeSortedByMostRecentDate() throws ParseException, InterruptedException {
        Assert.assertTrue(accountActivityPage.sortedMostDated());
    }

/*
    @When("the user enters date range from {string} to {string}")
    public void theUserEntersDateRangeFromTo2(String arg0, String arg1) {

    }

 */


/*
    @Then("results table should only show transactions dates between {string} to {string}")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo2(String arg0, String arg1) throws ParseException {
        Assert.assertTrue(accountActivityPage.betweenDates(arg0,arg1));
    }

 */




    @And("the results table should only not contain transactions dated “{string}”")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String date) {
        Assert.assertTrue(accountActivityPage.notContain(date));
        System.out.println("accountActivityPage.notContain(date) = " + accountActivityPage.notContain(date));

    }

    @When("the user enters description {string}")
    public void theUserEntersDescription(String keys) {
        accountActivityPage.sendOnline(keys);
    }

  

    @Then("results table should only show descriptions containing {string}")
    public void resultsTableShouldOnlyShowDescriptionsContaining(String text) {
        Assert.assertTrue(accountActivityPage.ısContain(text));
    }


    @But("results table should not show descriptions containing {string}")
    public void resultsTableShouldNotShowDescriptionsContaining(String arg0) {
    }

    @Then("results table should show at least one result under Deposit")
    public void resultsTableShouldShowAtLeastOneResultUnderDeposit() {
        Assert.assertTrue(accountActivityPage.ısDepositShow());
    }

    @Then("results table should show at least one result under Withdrawal")
    public void resultsTableShouldShowAtLeastOneResultUnderWithdrawal() {
        Assert.assertTrue(accountActivityPage.ısWithdrawalShow());
    }

    @When("user selects type {string}")
    public void userSelectsType(String selection) {
     accountActivityPage.typeSelection(selection);
    }

    @But("results table should show no result under {string}")
    public void resultsTableShouldShowNoResultUnder(String posit) {
         Assert.assertTrue(accountActivityPage.ısWithdrawalOrDepositEmpty(posit));

    }



}
