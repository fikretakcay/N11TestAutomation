import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Basket extends TrendyolTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDeatailPage productDeatailPage;
    Basket basketPage;
    @Test
    @Order(1)
    public void searchProduct() throws InterruptedException {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox.search("Tuvalet Kağıdı");
        System.out.println("Searching Product...");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on product page!");
        System.out.println("Product page is loaded.");
        Thread.sleep(2000);
    }

    @Test
    @Order(2)
    public void selectProduct() throws InterruptedException {
        productDeatailPage = new ProductDeatailPage(driver);
        productsPage.selectProduct(4);
        Thread.sleep(2500);
        System.out.println("4. Item is select.");
        Assertions.assertTrue(productDeatailPage.isOnProductDetailPage(),
                "Not on product detail page!");
        System.out.println("You are on product detail page");
        Thread.sleep(2000);
    }

    @Test
    @Order(3)
    public void addProductToBasket() throws InterruptedException {
        productDeatailPage.addToBasket();
        System.out.println("Product add to basket...");
        Assertions.assertTrue(homePage.isCountUpShopBasket(),
                "Count up is not increase!");
        System.out.println("Product is visible on basket.");
        Thread.sleep(1500);
    }

    @Test
    @Order(4)
    public void go_To_Basket(){
        basketPage = new Basket(driver);
        homePage.goToBasket();
        Assertions.assertTrue(basketPage.checkIfProductAdded(),
                "Product did not added to Basket!");

    }
}
