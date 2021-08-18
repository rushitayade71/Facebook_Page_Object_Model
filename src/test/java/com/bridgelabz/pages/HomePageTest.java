package com.bridgelabz.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bridgelabz.BaseClass;
import org.testng.annotations.*;

public class HomePageTest extends BaseClass {
    HomePage homePage;
    LoginPage loginPage;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extentReports;

    public HomePageTest() {
        super();
    }

    @BeforeSuite
    public void setUpTrstReport() {
        htmlReporter = new ExtentHtmlReporter("extent.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
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

    @Test(priority = 1)
    public void testSearch() {
        ExtentTest test1 = extentReports.createTest("Search preson on Facebook Search", "This is to validate search person functionality");
        homePage.search();
        test1.pass("Navigate to search page");
        test1.log(Status.INFO,"Starting Test case1");
        test1.info("Test1 Completed");
    }

    @Test(priority = 2)
    public void testFBProfile() {
        ExtentTest test2 = extentReports.createTest("Click on Facebook Profile", "This is to validate profile functionality");
        homePage.fbProfile();
        test2.pass("Navigate to fb profile page");
        test2.log(Status.INFO,"Starting Test case2");
        test2.info("Test2 Completed");
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @AfterSuite
    public void tearDown() {
        extentReports.flush();
    }
}
