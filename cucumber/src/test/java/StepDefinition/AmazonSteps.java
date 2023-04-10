package StepDefinition;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages=new AmazonPages(driver);

    @Given("User is on home page")
    public void userIsOnHomePage() {
        AmazonPages.HomePage();
    }

    @When("Click accept all cookies")
    public void clickAcceptAllCookies() {
        AmazonPages.AcceptCookies();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.SearchButton();
    }

    @When("Write the product name search bar")
    public void writeTheProductNameSearchBar() {
        AmazonPages.WriteProduct();
    }

    @When("Click search bar")
    public void clickSearchBar() {
        AmazonPages.SearchBar();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.ShippedByAmazon();

    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.FilterForApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.firstProduct();
    }

    @When("Add to cart")
    public void addToCart() {
        AmazonPages.AddToCart();
    }


    @When("Check at cart page")
    public void checkAtCartPage() {
        AmazonPages.ChechCart();
    }


}
