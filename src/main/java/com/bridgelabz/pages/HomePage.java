package com.bridgelabz.pages;

import com.bridgelabz.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {
//    @FindBy(name = "email")
//    private WebElement username;
//
//    @FindBy(name = "pass")
//    private WebElement password;
//
//    @FindBy(name = "login")
//    private WebElement login;

    @FindBy(name = "global_typeahead")
    private WebElement search;

    @FindBy(xpath = "//span[contains(text(),'Rushikesh Tayade')]")
    private WebElement profile;

    public HomePage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

//    public void userName(String uname) {
//        username.sendKeys(uname);
//    }
//
//    public void password(String pwd) {
//        password.sendKeys(pwd);
//    }
//
//    public void login() throws InterruptedException {
//        login.click();
//        Thread.sleep(9000);
//        driver.switchTo().alert().dismiss();
//
//    }

    public void search() {
        search.sendKeys("Rushikesh Tayade");
        search.sendKeys(Keys.ENTER);
    }
    public void fbProfile() {
        profile.click();
    }
}
