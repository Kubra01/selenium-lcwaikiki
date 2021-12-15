package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector( "input#search_input.search_input " );
    By deleteButton1 = By.xpath("//a[@class='cart-square-link']");
    By deleteCheckButton = By.xpath("//a[normalize-space(text())='Sil']");
    By emptyBasket = By.xpath("//p[@class='cart-empty-title']");


    public CartPage(WebDriver driver) {
        super( driver );
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }

    private List<WebElement> getProducts() {
        return findAll( productNameLocator );
    }


    public boolean checkIfProductDelete() { return getProducts().size() == 0 ;}
}

