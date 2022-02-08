import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By isOnProductPageLocator = By.xpath("//section[@class=\"filter filterSearch\"]");
    By productSelectLocator = By.cssSelector("h3.productName");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {

        return isDisplayed(isOnProductPageLocator);

    }

    public void selectProduct(int i) throws InterruptedException {

        getAllProducts().get(i).click();
        Thread.sleep(2000);
    }

    private List<WebElement> getAllProducts(){

        return findAll(productSelectLocator);
    }
}
