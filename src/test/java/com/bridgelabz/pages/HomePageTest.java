package com.bridgelabz.pages;

import com.bridgelabz.BaseClass;
import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;


public class HomePageTest extends BaseClass {
    HomePage homePage;
    LoginPage loginPage;


    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void TestUsername() {
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        loginPage.userName(prop.getProperty("username"));
        loginPage.password(prop.getProperty("password"));
        loginPage.login();
    }

//    @Test(priority = 3)
//    public void TestPassword() {
//        homePage.password(prop.getProperty("password"));
//    }
//
//    @Test(priority = 4)
//    public void TestLogin() throws InterruptedException {
//        homePage.login();
//    }

    @Test(priority = 1)
    public void testSearch() {
        homePage.search();
    }

    @Test(priority = 2)
    public void testFBProfile() {
        homePage.fbProfile();


    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
