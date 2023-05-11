package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

WebDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = getCloudDriver();
        driver.get("https://google.com");
    }

    public WebDriver getCloudDriver() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-72FL5");
        sauceOptions.put("name", "Chrome Browser Parallel Execution");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-tamerlash12-5c10c:83abda00-f956-4a8d-a72f-d516b9a11990@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }

    public WebDriver getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        return driver;
    }

    @AfterClass
    public void cleanUp() {
        WebDriverManager.chromedriver().setup();
        driver.close();
    }
}
