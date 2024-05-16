package tests.testcase_1_5;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {
    AutomationExercisePage aep=new AutomationExercisePage();
    Faker faker=new Faker();
    @Test
    void RegisterUser() {

        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise"));
        ReusableMethods.cookies(aep.cookies);

        // 3. Verify that home page is visible successfully
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());

        // 4. Click on 'Signup / Login' button
        aep.signupLogin.click();

        // 5. Verify 'New User Signup!' is visible
        Assert.assertTrue(aep.newUserSignuppText.isDisplayed());

        // 6. Enter name and email address
        aep.signupName.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.internet().emailAddress());

        // 7. Click 'Signup' button
        aep.signupButton.click();

        // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        Assert.assertTrue(aep.enterAccount.isDisplayed());

        // 9. Fill details: Title, Name, Email, Password, Date of birth
        aep.gender.click();

        aep.userName.clear();
        aep.userName.sendKeys(faker.name().firstName());

        aep.password.sendKeys(faker.internet().password(),Keys.TAB,
                "24", Keys.TAB,"September",Keys.TAB,"1978");

        // 10. Select checkbox 'Sign up for our newsletter!'
        aep.checkboxNewsletterText.click();

        // 11. Select checkbox 'Receive special offers from our partners!'
        aep.checkboxReceive.click();


        // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        aep.firstName.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.company().name(),Keys.TAB,
                faker.address().streetAddress(),Keys.TAB,
                faker.address().secondaryAddress(),Keys.TAB,
                "India",Keys.TAB,
                faker.address().state(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                faker.address().zipCode(),Keys.TAB,
                faker.phoneNumber().cellPhone());

        // 13. Click 'Create Account button'
        aep.createAccountButton.click();

        // 14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(aep.accountCreatedText.isDisplayed());

        // 15. Click 'Continue' button
        aep.continueButton.click();

        // 16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(aep.loggedText.isDisplayed());

        // 17. Click 'Delete Account' button
        aep.deleteButton.click();

        // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(aep.accountDeleteText.isDisplayed());

        aep.continueButton.click();

        Driver.closeDriver();

    }
}