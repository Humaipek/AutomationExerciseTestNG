package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Signup / Login")
    public WebElement signupLogin;
    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignuppText;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signupName;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccount;

    @FindBy(id = "id_gender2")
    public WebElement gender;
    @FindBy(id = "name")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "newsletter")
    public WebElement checkboxNewsletterText;
    @FindBy(id = "optin")
    public WebElement checkboxReceive;
    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedText;

    @FindBy(partialLinkText = "Delete Account")
    public WebElement deleteButton;
    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement accountDeleteText;

    @FindBy(xpath = "//p[.='Consent']")
    public WebElement cookies;

    @FindBy(id = "dismiss-button")
    public WebElement cookies2;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement LoginToYourAccount;

    @FindBy(css = "input[data-qa='login-email']")
    public WebElement registertEmail;

    @FindBy(css = "input[data-qa='login-password']")
    public WebElement registertPassword;

    @FindBy(partialLinkText = "Add to cart")
    public WebElement addToCart;

    @FindBy(xpath = "//button[.='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(partialLinkText = "Cart")
    public WebElement cart;

    @FindBy(partialLinkText = "Proceed To Checkout")
    public WebElement proceedToCheckout;

    @FindBy(css = "button[data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(partialLinkText = "Place Order")
    public WebElement placeOrder;

    @FindBy(name = "name_on_card")
    public WebElement nameOnCard;

    @FindBy(id = "submit")
    public WebElement payAndConfirmOrder;

    @FindBy(xpath = "//*[contains(text(),'Your order has been placed successfully!')]")
    public WebElement successText;









}
