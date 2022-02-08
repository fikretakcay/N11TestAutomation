import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDeatailPage extends BasePage{


    By addToCartButtonLocator = By.xpath("//div[@class=\"product-add-cart\"]");

    public ProductDeatailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {

        return isDisplayed(addToCartButtonLocator);
    }

    public void addToBasket() throws InterruptedException {

        click(addToCartButtonLocator);
        Thread.sleep(2000);
    }
}
