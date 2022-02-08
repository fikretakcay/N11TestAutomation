import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TrendyolTest {

    WebDriver driver;

    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();

        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("profile.default_content_setting_values.notifications", 2);

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.get("https://www.n11.com/");

        driver.manage().window().maximize();
    }
//    @AfterAll
//    public void tearDown(){
//        driver.quit();
//    }

}
