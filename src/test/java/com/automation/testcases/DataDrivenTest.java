package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

    LoginFeatures loginFeature = new LoginFeatures();

    @Test(dataProvider = "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials(String username, String password) {
        boolean result = loginFeature.doLogin(username, password);
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "invalidData")
    public Object[][] getInvalidData() {
        String[][] credentials = {
                {"admin", "admin123"},
                {"admin123", "admin123"},
                {"chirag", "admin123"},
                {"admin", "devx@123"},
                {"devx", "devx@123"},
                {"admin", "admin@123"}
        };
        return credentials;
    }

    @Test
    public void verifyLoginSuccessfulWithValidCred() {

    }
}
