import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By seacrhBoxLocator = By.id("searchData");
    By clickButtonLocator = By.xpath("//span[@class=\"icon iconSearch\"]");

    public SearchBox(WebDriver driver) {

        super(driver);
    }

    public void search(String text) throws InterruptedException {
        type(seacrhBoxLocator,text);
        Thread.sleep(3000);
        click(clickButtonLocator);
        Thread.sleep(3000);
    }
}
