package com.automation.testcases;

import com.dev.product.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MulTest extends BaseTest{
    Calculator cal = new Calculator();

    @Test
    public void testPositive(){
        int a = 4; int b = 3, expected = 12;
        int actual = cal.mul(a,b);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testWithZero(){
        int a = 0; int b = 3, expected = 0;
        int actual = cal.mul(a,b);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testWithNegativeNumber(){
        int a = 5; int b = -2, expected = -10;
        int actual = cal.mul(a,b);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testWithTwoNegativeNumber(){
        int a = -3; int b = -3, expected = 9;
        int actual = cal.mul(a,b);
        Assert.assertEquals(expected,actual);
    }
}
