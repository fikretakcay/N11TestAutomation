import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Basket extends BasePage{

    By productNameLocator = By.cssSelector("a.prodDescription");

    public Basket(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }
    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
}
