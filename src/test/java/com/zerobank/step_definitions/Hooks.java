package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.get("url"));//Open WebPage
        Driver.getDriver().findElement(By.cssSelector(".icon-signin")).click();//Click Sign In



    }
    @After
    public void tearDown(){
       //Driver.closeDriver();
    }

}
