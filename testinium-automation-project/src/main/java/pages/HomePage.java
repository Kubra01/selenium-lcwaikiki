package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchBox searchBox ;

    By cartCountLocator = By.id("nav-cart-count");
    By cartContainerLocator = new By.ByCssSelector("add-to-cart button-link add-to-cart-button");
    By acceptCookiesLocator = new  By.ByCssSelector("p.cookie__button");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }

//    public void delete_text_in_search_button_locator() {
//        if (isDisplayed( delete_text_in_search_button )){
//            click( delete_text_in_search_button);
//        }
//    }

}
