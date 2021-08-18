package com.bridgelabz;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    public BaseClass() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\FacebookSelenium\\src\\main\\java\\com\\bridgelabz\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver =new ChromeDriver(options);
//        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(prop.getProperty("URL"));
    }
//    public void screenshot() throws IOException {
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File("./com/bridgelabz/screenshots" + "facebook" + System.currentTimeMillis() + ".png");
//        FileHandler.copy(sourceFile, destinationFile);
//    }

}


