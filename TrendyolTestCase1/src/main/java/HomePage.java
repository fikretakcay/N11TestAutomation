import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By basketCountLocator = By.xpath("//span[@class=\"basketTotalNum\"]");
    By goToBasketLocator = By.xpath("//i[@class=\"icon iconBasket\"]");

    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }
    public SearchBox searchBox(){
        return this.searchBox;

    }

    public boolean isCountUpShopBasket() {

        return getBasketCount() > 0 ;
    }

    public void goToBasket() {

        click(goToBasketLocator);
    }
    private int getBasketCount(){
        String count = find(basketCountLocator).getText();
        return Integer.parseInt(count);
    }
}
