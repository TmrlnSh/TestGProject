package com.automation.testcases;

import com.dev.product.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest {
    Calculator cal = new Calculator();
    @Test(dataProvider = "invalidData")
    public void divTest(int a, int b){
        if(b==0){
            try{
                cal.div(a,b);
                Assert.fail("Expected exception but it is not throwing exception");
            } catch (Exception e){
                String actualMessage = e.getMessage();
                String expectedMessage = "/ by zero";
                Assert.assertEquals(expectedMessage, actualMessage);
                Assert.assertTrue(expectedMessage.equals(actualMessage));
            }
        }
        int expected = a/b;
        int actual = cal.div(a,b);
        Assert.assertEquals(expected, actual);
    }
    @DataProvider(name = "invalidData")
    public Object[][] getInvalidData() {
        Integer[][] nums = {
                {-5, 5},
                {10, 2},
                {25, -5},
                {0, 100},
                {10, 0},
                {36, 6}
        };
        return nums;
    }
}
