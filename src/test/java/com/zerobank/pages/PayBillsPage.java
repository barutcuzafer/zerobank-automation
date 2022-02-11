package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class PayBillsPage extends BasePage{

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayee;

    public void clickOnAddNewPayee(){
        addNewPayee.click();
    }

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;
    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;
    @FindBy(id = "np_new_payee_account")
    public WebElement payeeAccount;
    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;
    @FindBy(id = "add_new_payee")
    public WebElement addNewPayeeButton;
    @FindBy(id = "alert_content")
    public WebElement theMessage;

    public void createNewPayee(Map<String,String> payeeInfo){

        payeeName.sendKeys(payeeInfo.get("Payee Name"));
        payeeAddress.sendKeys(payeeInfo.get("Payee Address"));
        payeeAccount.sendKeys(payeeInfo.get("Account"));
        payeeDetails.sendKeys(payeeInfo.get("Payee Details"));
        addNewPayeeButton.click();

    }
    public boolean isMessageDisplayedAccurately(String expectedMessage){
       boolean verify=false;

        String actual= theMessage.getText();
        if(expectedMessage.equals(actual)){
            verify=true;
        }
        return verify;


        }

        @FindBy(linkText = "Purchase Foreign Currency")
         public WebElement purchaseForeignCurrency;

         public void clickOnpurchaseForeignCurrency(){
        purchaseForeignCurrency.click();
         }

         @FindBy(id = "pc_currency")
          public WebElement currencySelect;


          public boolean areCurrenciesAvailable(List<String> currencies){
              boolean verify=false;
              Select select=new Select(currencySelect);
              List<String> selectOptions=BrowserUtils.getElementsText(select.getOptions());
              if(selectOptions.containsAll(currencies)){
                  verify=true;
              }
              return verify;
          }
          @FindBy(id = "pc_calculate_costs")
          public WebElement calculateCost;

          public boolean isAlertMessageDisplayed(){
              boolean verify=false;
              String str= Driver.getDriver().switchTo().alert().getText();
              if(str!=null){
                  verify=true;
              }
              return verify;
          }
          @FindBy(id = "pc_amount")
          public WebElement amountBox;

          public void tryWithoutCurrency(){
              BrowserUtils.waitFor(2);
              calculateCost.click();
              Driver.getDriver().switchTo().alert().accept();
              amountBox.sendKeys("100");
              calculateCost.click();
              Driver.getDriver().switchTo().alert().accept();
              amountBox.clear();
          }
    public void tryWithoutAmount(){
              BrowserUtils.waitFor(2);
        Select select=new Select(currencySelect);
        List<String> selectOptions=BrowserUtils.getElementsText(select.getOptions());
              for(int i=1;i<selectOptions.size()-1;i++){
                  select.selectByIndex(i);
                  calculateCost.click();
                  Driver.getDriver().switchTo().alert().accept();
              }
        calculateCost.click();



    }














    }




