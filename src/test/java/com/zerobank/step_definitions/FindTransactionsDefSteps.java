package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBanking;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindTransactionsDefSteps {

   AccountActivityPage accountActivityPage=new AccountActivityPage();


    @Given("the user accesses the Find Transactions tab")
    public void theUserAccessesTheFindTransactionsTab()  {
       accountActivityPage.clickFindTransactions();
    }


    @When("the user enters date range from “{string}” to “{string}”")
    public void theUserEntersDateRangeFromTo(String fromDate, String toDate) {
       accountActivityPage.fromDate.sendKeys(fromDate);
       accountActivityPage.toDate.sendKeys(toDate);

    }

    @And("clicks search")
    public void clicksSearch() {
        accountActivityPage.findButton.click();
    }


    @Then("results table should only show transactions dates between “{string}” to “{string}”")
    public void resultsTableShouldOnlyShowTransactionsDatesBetweenTo(String arg0, String arg1) {
     //  List<WebElement>dates=Driver.getDriver().findElements(By.xpath("(//table)[2]/tbody/tr[1]/td[1]"));

        List<WebElement>dates=Driver.getDriver().findElements(By.xpath("(//table)[2]/tbody"));
        System.out.println("dates.get(0) = " + dates.get(0).getText());
    }
}
