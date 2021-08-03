package com.bridgelabz.pages;

import com.bridgelabz.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BaseClass {

    @FindBy(xpath = "//a[contains(text(),'Create New Account')]")
    private WebElement register;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "reg_email__")
    private WebElement email1;

    @FindBy(name = "reg_email_confirmation__")
    private WebElement email2;

    @FindBy(name = "reg_passwd__")
    private WebElement pass;

    @FindBy(name = "birthday_day")
    private WebElement day;

    @FindBy(name = "birthday_month")
    private WebElement month;

    @FindBy(name = "birthday_year")
    private WebElement year;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    private WebElement gender;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    public void CreateNewAccount() {
        register.click();
        System.out.println("Text on Register Page :- " + register.getText());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void firstname(String fnmae) {
        firstName.sendKeys(fnmae);
        System.out.println("First Name is :- " + fnmae);
    }

    public void lastname(String lname) {
        lastName.sendKeys(lname);
        System.out.println("Last Name is :- " + lname);
    }

    public void email(String email) {
        email1.sendKeys(email);
        System.out.println("Email is :- " + email);
    }

    public void confirmationEmail(String confEmail) {
        email2.sendKeys(confEmail);
        System.out.println("Confirmation Email is :- " + confEmail);
    }

    public void password(String pwd) {
        pass.sendKeys(pwd);
        System.out.println("Password is :- " + pwd);
    }

    public void dateOfBirth(String days, String months, String years) {
        day.sendKeys(days);
        month.sendKeys(months);
        year.sendKeys(years);
    }

    public void gender() {
        gender.click();
        System.out.println("Gender selected is :- " + gender.getText());
    }
}