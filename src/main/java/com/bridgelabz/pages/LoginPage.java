package com.bridgelabz.pages;

import com.bridgelabz.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseClass {

    @FindBy(name = "email")
    private WebElement username;

    @FindBy(name = "pass")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement login;

    public LoginPage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    public void userName(String uname) {
        username.sendKeys(uname);
    }

    public void password(String pwd) {
        password.sendKeys(pwd);
    }

    public void login() {
        login.click();
    }
}
