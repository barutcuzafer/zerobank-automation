package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    public WebElement drop;

    Select dropDown=new Select(drop);
    public String  checkDropDown(){
        return dropDown.getFirstSelectedOption().getText();
    }

;    public String checkTitle(){
        return Driver.getDriver().getTitle();
    }


    @FindBy(linkText = "Find Transactions")
    public WebElement findTransactionsButton;

    public void clickFindTransactions(){
      findTransactionsButton.click();
    }

    @FindBy(id = "aa_fromDate")
    public WebElement fromDate;
    @FindBy(id = "aa_toDate")
    public WebElement toDate;
    @FindBy(css = ".btn.btn-primary")
    public WebElement findButton;

    public void sendKeys(String  date1,String date2){
        fromDate.clear();
        toDate.clear();
        fromDate.sendKeys(date1);
        toDate.sendKeys(date2);


    }
    public void clickFind(){
        findButton.click();


    }

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public List <WebElement> listedDates;
      public boolean betweenDates(String date1,String date2) throws ParseException, InterruptedException {
          Thread.sleep(2);
          boolean verify=true;
          //retrieve listedDates web elements text and adds new list of string
          List<String>dateList=BrowserUtils.getElementsText(listedDates);
           //create new List of Dates ArrayList
          List<Date> dates = new ArrayList<Date>();
          //created custom dateformat
          DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
          //parsing strings to the date format and adding to dates arrayist
          for(String element:dateList){
              dates.add(new SimpleDateFormat("yyyy/MM/dd").parse(element.replaceAll("-","/")));
          }
          //sort dates arraylist and assign to new arraylist(sorted)
          List<Date> sorted = dates.stream().sorted(Comparator.comparingLong(Date::getTime)).toList();

          List<String> stringSortedDates=new ArrayList<String>();

         for(Date element:sorted){
             stringSortedDates.add(dateFormat.format(element));
         }
          if(stringSortedDates.get(0).equals(date1)&&stringSortedDates.get(stringSortedDates.size()-1).equals(date2)){
              verify=true;
          }

          return verify;
      }
    public boolean sortedMostDated() throws InterruptedException, ParseException {//with DATE class

        Thread.sleep(1000);
        boolean verify= false;
        List<String> stringDates = BrowserUtils.getElementsText(listedDates);

        List<Date> dates = new ArrayList<Date>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (String element : stringDates) {
            dates.add(new SimpleDateFormat("yyyy/MM/dd").parse(element.replaceAll("-","/")));
        }
        List<Date> sorted = dates.stream()
                .sorted(Comparator.comparingLong(Date::getTime)).toList();
        List<String> stringSortedDates = new ArrayList<String>();
        for (Date element : sorted) {
            stringSortedDates.add(dateFormat.format(element)) ;
        }
        verify=stringSortedDates.get(stringSortedDates.size()-1).equals(stringDates.get(0));
        return verify;

    }

    public boolean notContain(String date){
          BrowserUtils.waitFor(5);
        boolean verify=false;
        List<String> stringDates = BrowserUtils.getElementsText(listedDates);
         for(String str:stringDates){
             if(!str.contains(date)){
                 verify=true;
             }
         }
        return verify;

    }

    @FindBy(id="aa_description")
    public WebElement description;

      public void sendOnline(String keys){
          description.clear();
          description.sendKeys(keys);
      }

      @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[2]")
    public List<WebElement> descriptionText;

      public boolean ısContain(String text){
          BrowserUtils.waitFor(5);
          boolean verify=false;
          List<String>str=BrowserUtils.getElementsText(descriptionText);
          for(String texts:str){
              if(texts.contains(text)){
                  verify=true;
              }
          }
          return verify;
      }


     @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[3]")
     public List<WebElement> deposit;
      public boolean ısDepositShow(){
          boolean verify=false;
          List<String>str=new ArrayList<>();
         for(int i=0;i<deposit.size()-1;i++){
             str.add(deposit.get(i).getText());
             if(str.get(i)!=null){
                 verify=true;
                 break;
             }
         }

          return verify;
      }
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[4]")
    public List<WebElement> withdrawal;
    public boolean ısWithdrawalShow(){
        boolean verify=false;
        List<String>str=new ArrayList<>();
        for(int i=0;i<withdrawal.size()-1;i++){
            str.add(withdrawal.get(i).getText());
            if(str.get(i)!=null){
                verify=true;
                break;
            }
        }

        return verify;
    }
    @FindBy(id = "aa_type")
    public WebElement type;
    public void typeSelection(String text){
        Select select=new Select(type);
        select.selectByVisibleText(text);
    }
    public boolean ısWithdrawalOrDepositEmpty(String locator){
        BrowserUtils.waitFor(5);
        boolean verify=true;
        switch (locator){
            case "Withdrawal":
        List<String>str=BrowserUtils.getElementsText(deposit);
        for(String text:str){
            if(text.equals(null)){
                verify=false;
                break;
        }
        }
                break;
             case "Deposit":
                    List<String>str2=BrowserUtils.getElementsText(withdrawal);
                    for(String text2:str2){
                        if(text2.equals(null)){
                            verify=false;
                            break;
                        }
                        }

                            break;
                    }
        return verify;
        }

        @FindBy(linkText = "Pay Bills")
         public WebElement payBills;
        public void clickpayBills(){
            payBills.click();
    }

    }




















