package com.bridgelabz.pages;

import com.bridgelabz.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage loginPage;

    public LoginPageTest() {
        super();
    }

    @BeforeTest
    public void hitURL() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 2)
    public void TestUsername() {
        loginPage.userName(prop.getProperty("username"));
    }

    @Test(priority = 3)
    public void TestPassword() {
        loginPage.password(prop.getProperty("password"));
    }

    @Test(priority = 4)
    public void TestLogin() {
        loginPage.login();
    }
}
