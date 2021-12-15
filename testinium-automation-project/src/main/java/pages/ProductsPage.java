package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By shippingOptionLocator =new By.ByCssSelector("span.product-list-heading__product-count");
    By productNameLocator = new By.ByCssSelector("img.product-lazy-image.lazyloaded" );
    By formoreProductsLocator = new By.ByCssSelector("a.lazy-load-button");
    By product2locator =new By.ByCssSelector("img.product-large-image" );

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(int i){
        return findAll(productNameLocator);
    }

    private List<WebElement> getAllProducts(){
        return findAll( product2locator );
    }

}
