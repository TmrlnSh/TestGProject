package com.automation.testcases;

import org.testng.annotations.Test;

public class SearchFunctionalityTest extends BaseTest{
    @Test
    public void verifySearchResultAreDisplayed(){
        System.out.println("verify search result");
    }

    @Test
    public void verifyMessageWhenThereAreNoResult(){
        System.out.println("verify no result message");
    }

    @Test
    public void verifySearchResultHasSearchKeyword(){
        System.out.println("verify search result has search keyword");
    }
}

