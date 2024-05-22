package tests.testcase_11_15;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HocaIcinPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC14 {

    HocaIcinPage aep=new HocaIcinPage();
    Faker faker=new Faker();

        @Test
        void PlaceOrderRegisterWhileCheckout() throws InterruptedException {
            String kayitliMail="graeme.cullan@floodouts.com";
            String kayitliPassword="Dunya1234";

//   Navigate to url 'http://automationexercise.com'
            Driver.getDriver().get(ConfigReader.getProperty("automationExercise"));
            Thread.sleep(2);

            aep.signupLogin.click();

            aep.registertEmail.sendKeys(kayitliMail);
            aep.registertPassword.sendKeys(kayitliPassword);

            aep.loginButton.click();

            aep.addToCart.click();
            aep.continueShopping.click();

            aep.cart.click();
            Thread.sleep(2);

            aep.proceedToCheckout.click();
            Thread.sleep(2);


            aep.placeOrder.click();
            Thread.sleep(2);

            aep.nameOnCard.sendKeys(faker.name().firstName(),Keys.TAB,
                    faker.number().digits(16),Keys.TAB,
                    faker.number().digits(3),Keys.TAB,
                    faker.number().digits(1),Keys.TAB,
                    faker.number().digits(4));

            aep.payAndConfirmOrder.click();



//   Verify success message 'Your order has been placed successfully!'

            Assert.assertTrue(aep.successText.isDisplayed());


        }
    }


