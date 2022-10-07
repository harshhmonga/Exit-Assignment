package tests;
import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class myProfile extends BasePages.mainPage {
    public  static Logger logger = Logger.getLogger(myProfile.class);
    @Test
    public void profile() throws InterruptedException {
        test.log(LogStatus.INFO,"Test Passed");
        logger.info("Login using credentials");
        // login using the credentials
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.continue_btn).click();
        Thread.sleep(3000);
//        hover over my account button
        logger.info("My account button clicked");
        WebElement accMenu = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accMenu).build().perform();
        Thread.sleep(3000);
//        going to my profile sub menu
        logger.info("Going to my profile");
        WebElement myProfile = driver.findElement(By.xpath("//div[contains(text(),'My Profile')]"));
        actions.moveToElement(myProfile).click().build().perform();
    }
}