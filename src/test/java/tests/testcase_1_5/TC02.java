package tests.testcase_1_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.*;

public class TC02 {

    AutomationExercisePage aep=new AutomationExercisePage();

    @Test
    void LoginUserWithCorrectEmailAndPassword() {

      /*  ReusableMethods.createExtentReport("RegisterUser");
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise"));


        // 3. Verify that home page is visible successfully
        assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl(),"That home page is not visible successfully");


        // 4. Click on 'Signup / Login' button
        aep.signupLogin.click();

        //  5. Verify 'Login to your account' is visible
        assertTrue(aep.LoginToYourAccount.isDisplayed());

        //  6. Enter correct email address and password
        aep.registertEmail.sendKeys(aep);
        aep.registertPassword.sendKeys(kayitliPassword);

        //  7. Click 'login' button
        driver.findElement(By.cssSelector("button[data-qa='login-button'] ")).click();

        //  8. Verify that 'Logged in as username' is visible
        WebElement logged= driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        assertTrue(logged.isDisplayed());

        //  9. Click 'Delete Account' button
        WebElement delete= driver.findElement(By.partialLinkText("Delete Account"));
        delete.click();

        //  10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountdeleted= driver.findElement(By.xpath("//b[.='Account Deleted!']"));
        assertTrue(accountdeleted.isDisplayed());*/
    }


}


