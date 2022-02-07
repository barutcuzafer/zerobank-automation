package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.get("url"));



    }
    @After
    public void tearDown(){
      //  Driver.closeDriver();
    }

}
