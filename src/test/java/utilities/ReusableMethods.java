package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethods {

    protected Faker faker = new Faker();
    protected String kayitliEmailAdres="graeme.cullan@floodouts.com";


    public static void emailregistering() {
        AutomationExercisePage aep=new AutomationExercisePage();
        Faker faker=new Faker();

            // 1. Launch browser
            // 2. Navigate to url 'http://automationexercise.com'
            Driver.getDriver().get(ConfigReader.getProperty("automationExercise"));


            // 3. Verify that home page is visible successfully
            Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());

            // 4. Click on 'Signup / Login' button
            aep.signupLogin.click();

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


            // 15. Click 'Continue' button
            aep.continueButton.click();


        }
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    public static void createExtentReport(String testName){
        //Bu objecti raporlari olusturmak ve yönetmek icin kullanacağız
        extentReports = new ExtentReports();

        //Oncelikle olusturmak istedigimiz html report projemizde nerede saklamak istiyorsak bir dosya yolu olusturmaliyz
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(  LocalDateTime.now());
        String path ="target/extentReport/"+date+"htmlReport.html";
        extentHtmlReporter = new ExtentHtmlReporter(path);

        //ExtentsReports'a html raporlayici ekler,ve bu raporun html formatinda olusturulmasini saglar
        extentReports.attachReporter(extentHtmlReporter);

        //HTML raporun belge basligini ayarlar
        extentHtmlReporter.config().setDocumentTitle("Batch 231");

        //Raporda gösterilecek olan genel basligi ayarlar
        extentHtmlReporter.config().setReportName("My Extent Report");

        //Bu html raporunda görmek isteyebileceğimz diger bilgileri asagidaki sekilde ekleyebiliriz
        extentReports.setSystemInfo("Environment","QA");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Test Automation Engineer","Ali Can");

        //AmazonTest adinda yeni bir test olusturur ve Test Steps aciklamasini ekler
        extentTest = extentReports.createTest(testName,"Test Steps");
    }
}
