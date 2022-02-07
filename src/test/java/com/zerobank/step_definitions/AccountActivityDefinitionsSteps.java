package com.zerobank.step_definitions;

import com.zerobank.pages.goToAccountSummaryViaOnlineBanking;
import io.cucumber.java.en.When;

public class AccountActivityDefinitionsSteps {

    @When("the user clicks on {string} link on the Account Summary page")
    public void theUserClicksOnLinkOnTheAccountSummaryPage(String arg0) {

        goToAccountSummaryViaOnlineBanking go=new goToAccountSummaryViaOnlineBanking();
        go.onlineBankingAndAccountSummary();

    }
}
