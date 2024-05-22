package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HocaIcinPage {
    public HocaIcinPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Signup / Login")
    public WebElement signupLogin;

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
