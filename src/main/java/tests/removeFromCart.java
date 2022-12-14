package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class removeFromCart extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(removeFromCart.class);

    @Test
    public void remove() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");

        logger.info("Login using valid credentials");
        // Login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(2000);
        logger.info("Going to cart");
//        click on cart button
        driver.findElement(LoginPage.gotoCart).click();
        Thread.sleep(2000);
//        scrolling the webpage
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
//        removing the item from cart
        logger.info("Removing item from cart");
        driver.findElement(commonPage.removeButton).click();
        driver.findElement(commonPage.removeConfirm).click();

    }
}
