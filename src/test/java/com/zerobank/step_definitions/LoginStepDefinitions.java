package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        loginPage.clickOnOnlineBanking();

    }




}
