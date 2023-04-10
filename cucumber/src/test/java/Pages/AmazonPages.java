package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By searchbar = By.id("twotabsearchtextbox");
    static By searchButton = By.cssSelector("#nav-search-submit-button");
    static By shippedFromAmazon = By.cssSelector("body > div:nth-child(1) > div:nth-child(28) > div:nth-child(10) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(4) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By apple = By.xpath("//li[@id='p_89/Apple']//i[@class='a-icon a-icon-checkbox']");
    static By first = By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'] span:nth-child(1)");
    static By addToCart = By.cssSelector("#add-to-cart-button");
    static By cart= By.cssSelector("#nav-cart-count");
    static By back = By.id("attach-close_sideSheet-link");
    static By check = By.cssSelector(".a-truncate-cut");
    public AmazonPages (WebDriver driver){
        this.driver = driver;
        this.wait= new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);

    }

    public static void HomePage() {
    }

    public static void AcceptCookies() {
        elementHelper.click(accept);
    }

    public static void SearchBar() {
        elementHelper.click(searchbar);
    }

    public static void WriteProduct() {
        elementHelper.sendKeys(searchbar,"Airpods");
    }

    public static void SearchButton() {
        elementHelper.click(searchButton);
    }

    public static void FilterForApple() {
        elementHelper.click(apple);
    }

    public static void ShippedByAmazon() {
        elementHelper.click(shippedFromAmazon);
    }

    public static void firstProduct() {
        elementHelper.click(first);
    }

    public static void AddToCart() {
        elementHelper.click(addToCart);
        elementHelper.click(back);
        elementHelper.click(cart);
    }

    public static void ChechCart() {
        elementHelper.checkVisible(check);
    }
}
