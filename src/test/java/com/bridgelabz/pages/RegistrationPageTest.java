package com.bridgelabz.pages;

import com.bridgelabz.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseClass {
    RegistrationPage registration;

    public RegistrationPageTest() {
        super();
    }

    @BeforeTest
    public void hitURL() {
        initialization();
        registration = new RegistrationPage();
    }

    @Test(priority = 1)
    public void testCreateNewAccount() {
        registration.CreateNewAccount();
    }

    @Test(priority = 2)
    public void testFirstname() {
        registration.firstname("Rushikesh");
    }

    @Test(priority = 3)
    public void testLastname() {
        registration.lastname("Tayade");
    }

    @Test(priority = 4)
    public void testEmail() {
        registration.email("rushi123@gmail.com");
    }

    @Test(priority = 5)
    public void testConfeEmail() {
        registration.confirmationEmail("rushi123@gmail.com");
    }

    @Test(priority = 6)
    public void testPassword() {
        registration.password("Rushi@123");
    }

    @Test(priority = 7)
    public void testDateOfBirth() {
        registration.dateOfBirth("25", "Apr", "1998");
    }

    @Test(priority = 8)
    public void testGender() {
        registration.gender();
    }
}
